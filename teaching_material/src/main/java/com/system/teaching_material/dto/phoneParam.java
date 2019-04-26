package com.system.teaching_material.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:${config.location}")
@ConfigurationProperties(prefix="phone")
public class phoneParam {
    @Value(value = "${phone.sid}")
    private String sid;

    @Value(value = "${phone.token}")
    private String token;

    @Value(value = "${phone.appid}")
    private String appid;

    @Value(value = "${phone.templateid}")
    private String templateid;

    @Value(value = "${phone.uid}")
    private String uid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}

