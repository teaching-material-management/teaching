package com.system.teaching_material.pojo;
import java.io.Serializable;
/***
*   
*/
public class TeachingMaterialWheelPlanting implements Serializable {
    //轮播图编号
    private String wpId;
    //轮播的位置：0-首页，1-幻灯片，2-热门推荐
    private String wpIndex;
    //轮播图名称
    private String wpName;
    //轮播状态：0-已启用，1-未启用，2-已删除
    private String wpStatu;
    //权重，对应的轮播位置，范围是0—4之间（越小越靠前）
    private String wpWeight;
    //图片名称
    private String wpImagename;
    //图片内容
    private String wpImageconent;
    //图片路径
    private String wpImagepath;
    //get set 方法
    public void setWpId (String  wpId){
        this.wpId=wpId;
    }
    public  String getWpId(){
        return this.wpId;
    }
    public void setWpIndex (String  wpIndex){
        this.wpIndex=wpIndex;
    }
    public  String getWpIndex(){
        return this.wpIndex;
    }
    public void setWpName (String  wpName){
        this.wpName=wpName;
    }
    public  String getWpName(){
        return this.wpName;
    }
    public void setWpStatu (String  wpStatu){
        this.wpStatu=wpStatu;
    }
    public  String getWpStatu(){
        return this.wpStatu;
    }
    public void setWpWeight (String  wpWeight){
        this.wpWeight=wpWeight;
    }
    public  String getWpWeight(){
        return this.wpWeight;
    }
    public void setWpImagename (String  wpImagename){
        this.wpImagename=wpImagename;
    }
    public  String getWpImagename(){
        return this.wpImagename;
    }
    public void setWpImageconent (String  wpImageconent){
        this.wpImageconent=wpImageconent;
    }
    public  String getWpImageconent(){
        return this.wpImageconent;
    }
    public void setWpImagepath (String  wpImagepath){
        this.wpImagepath=wpImagepath;
    }
    public  String getWpImagepath(){
        return this.wpImagepath;
    }
}
