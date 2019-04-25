package com.system.teaching_material.utils;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class EmailManager {
	// 服务邮箱(from邮箱)
	public static String username = "2241914383@qq.com";
	// 邮箱密码
	public static String password = "*****";//
	// 发件人昵称
	public static String senderNick = "竹永乐" ;
	// 系统属性
	private Properties props;
	// 邮件会话对象
	private Session session;
	// MIME邮件对象
	private MimeMessage mimeMsg;
	// Multipart对象,邮件内容,标题,附件等内容均添加到其中后再生成MimeMessage对象
	private Multipart mp;

	private static EmailManager instance = null;

	public EmailManager() {

		props = System.getProperties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", "smtp.qq.com");
		props.put("mail.smtp.port", "25");
		props.put("username", username);
		props.put("password", password);
		// 建立会话
		session = Session.getDefaultInstance(props);
		session.setDebug(false);

	}

	public static EmailManager getInstance() {
		if (instance == null) {
			instance = new EmailManager();
		}
		return instance;
	}

	/**
	 * 发送邮件
	 *
	 * @param from  	 发件人
	 * @param to  	 	 收件人
	 * @param copyto  	 抄送
	 * @param subject	 主题
	 * @param content	 内容
	 * @param fileList 	 附件列表
	 * @return
	 */

	public boolean sendMail(String from, String[] to, String[] copyto, String subject, String content,
							String[] fileList) {
		boolean success = true;
		try {
			mimeMsg = new MimeMessage(session);
			mp = new MimeMultipart();
			// 自定义发件人昵称
			String nick = "";
			try {
				nick = javax.mail.internet.MimeUtility.encodeText(senderNick);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			// 设置发件人
			mimeMsg.setFrom(new InternetAddress(from, nick));
			// 设置收件人
			if (to != null && to.length > 0) {
				String toListStr = getMailList(to);
				mimeMsg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toListStr));
			}
			// 设置抄送人

			if (copyto != null && copyto.length > 0) {
				String ccListStr = getMailList(copyto);
				mimeMsg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccListStr));
			}

			// 设置主题
			mimeMsg.setSubject(subject);

			// 设置正文
			BodyPart bp = new MimeBodyPart();
			bp.setContent("<h1 align='center' style='color:pink'>"+content+"</h1>", "text/html;charset=utf-8");
			mp.addBodyPart(bp);
			// 设置附件
			if (fileList != null && fileList.length > 0) {
				for (int i = 0; i < fileList.length; i++) {
					bp = new MimeBodyPart();
					FileDataSource fds = new FileDataSource(fileList[i]);
					bp.setDataHandler(new DataHandler(fds));
					bp.setFileName(MimeUtility.encodeText(fds.getName(), "UTF-8", "B"));
					mp.addBodyPart(bp);
				}
			}
			mimeMsg.setContent(mp);
			mimeMsg.saveChanges();
			// 发送邮件
			if (props.get("mail.smtp.auth").equals("true")) {
				System.out.println("开始发送邮件...");
				Transport transport = session.getTransport("smtp");
				transport.connect((String) props.get("mail.smtp.host"), (String) props.get("username"),
						(String) props.get("password"));
				transport.sendMessage(mimeMsg, mimeMsg.getAllRecipients());
				transport.close();
			} else {
				Transport.send(mimeMsg);
			}
			System.out.println("邮件发送成功");

		} catch (MessagingException e) {
			e.printStackTrace();
			success = false;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			success = false;
		}
		return success;
	}

	public String getMailList(String[] mailArray) {
		StringBuffer toList = new StringBuffer();
		int length = mailArray.length;
		if (mailArray != null && length < 2) {
			toList.append(mailArray[0]);
		} else {
			for (int i = 0; i < length; i++) {
				toList.append(mailArray[i]);
				if (i != (length - 1)) {
					toList.append(",");
				}
			}
		}
		return toList.toString();
	}


	public String  sendEmail(String[] to,String[] copyto,String subject,String content,String[]fileList){
		String from = username;
		EmailManager.getInstance().sendMail(from, to, copyto, subject, content, fileList);
		return "";
	}


}