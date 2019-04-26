package com.system.teaching_material.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class TeachingMaterialUser implements Serializable {
    //用户id
    private String userId;
    //用户昵称
    private String userNick;
    //绑定手机号
    private String userPhone;
    //绑定邮箱
    private String userEmail;
    //密码
    private String userPassword;
    //登录通行证
    private String userToken;
    //注册时间
    private Date craetedtime;
    //等级，0：普通用户，1：系统管理人员
    private String userLevel;
    //get set 方法
    public void setUserId (String  userId){
        this.userId=userId;
    }
    public  String getUserId(){
        return this.userId;
    }
    public void setUserNick (String  userNick){
        this.userNick=userNick;
    }
    public  String getUserNick(){
        return this.userNick;
    }
    public void setUserPhone (String  userPhone){
        this.userPhone=userPhone;
    }
    public  String getUserPhone(){
        return this.userPhone;
    }
    public void setUserEmail (String  userEmail){
        this.userEmail=userEmail;
    }
    public  String getUserEmail(){
        return this.userEmail;
    }
    public void setUserPassword (String  userPassword){
        this.userPassword=userPassword;
    }
    public  String getUserPassword(){
        return this.userPassword;
    }
    public void setUserToken (String  userToken){
        this.userToken=userToken;
    }
    public  String getUserToken(){
        return this.userToken;
    }
    public void setCraetedtime (Date  craetedtime){
        this.craetedtime=craetedtime;
    }
    public  Date getCraetedtime(){
        return this.craetedtime;
    }
    public void setUserLevel (String  userLevel){
        this.userLevel=userLevel;
    }
    public  String getUserLevel(){
        return this.userLevel;
    }

    public TeachingMaterialUser(String userId, String userNick, String userPhone, String userEmail, String userPassword, String userToken, Date craetedtime, String userLevel) {
        this.userId = userId;
        this.userNick = userNick;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userToken = userToken;
        this.craetedtime = craetedtime;
        this.userLevel = userLevel;
    }

    public TeachingMaterialUser() {
        super();
    }
}
