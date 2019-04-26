package com.system.teaching_material.utils;

import com.system.teaching_material.utils.daunxin.client.AbsRestClient;
import com.system.teaching_material.utils.daunxin.client.JsonReqClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class ChekcOut {

 	 @Value("${phone.sid}")
	 private String sid;

	@Value(value = "${phone.token}")
	private String token;

	@Value(value = "${phone.appid}")
	private String appid;

	@Value(value = "${phone.templateid}")
	private String templateid;

	@Value(value = "${phone.uid}")
	private String uid;

	static AbsRestClient InstantiationRestAPI() {
		return new JsonReqClient();
	}

	//调用发送验证码
	public void sendYzm(String mobile) {
		int yzm=(int) (Math.random()*(9999-1111))+1111;
		String param = yzm+"";
		String result = InstantiationRestAPI().sendSms(sid, token, appid, templateid, param, mobile, uid);
		System.out.println(yzm);
		System.out.println("Response content is: " + result);

	}

	public void a() {
		System.out.println(sid);
		String mobile="17600617885";
		sendYzm(mobile);
	}
}
