package com.system.teaching_material.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

@Configuration
@EnableConfigurationProperties
public class EmailManager {
	// 服务邮箱(from邮箱)
	@Value("${email.username}")
	public  String username;
	// 邮箱密码
	@Value("${email.password}")
	public  String password;
	// 发件人昵称
	@Value("${email.senderNick}")
	public  String senderNick;

	// 系统属性
	private Properties props;
	// 邮件会话对象
	private Session session;
	// MIME邮件对象
	private MimeMessage mimeMsg;
	// Multipart对象,邮件内容,标题,附件等内容均添加到其中后再生成MimeMessage对象
	private Multipart mp;

	//初始化设置
	public void instance(){
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

	/**
	 * 发送邮件
	 *
	 * @param from  	 发件人
	 * @param to  	 	 收件人
	 * @param subject	 主题
	 * @param content	 内容
	 * @return
	 */

	public boolean sendMail(String from, String to, String subject, String content) {
		instance();
		boolean msg = true;
		try {
			mimeMsg = new MimeMessage(session);
			mp = new MimeMultipart();
			// 自定义发件人昵称
			String nick = javax.mail.internet.MimeUtility.encodeText(senderNick);
			// 设置发件人
			mimeMsg.setFrom(new InternetAddress(from, nick));
			// 设置收件人
			if (to != null) {
				mimeMsg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			}
			// 设置主题
			mimeMsg.setSubject(subject);
			// 设置正文
			BodyPart bp = new MimeBodyPart();
			bp.setContent(content, "text/html;charset=utf-8");
			mp.addBodyPart(bp);
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
			msg = false;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			msg = false;
		}
		return msg;
	}


	public String  sendEmail(String to,String subject,String content){
		String from = username;
		System.out.println(username);
		sendMail(from, to, subject, content);
		return "";
	}


}