package com.system.teaching_material.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class TeachingMaterial implements Serializable {
    //教材编号
    private String tmId;
    //教材分类编号
    private String tmTypeId;
    //教材名称
    private String tmName;
    //教材书号
    private String tmNumber;
    //教材页数
    private String tmPageNumber;
    //教材定价
    private String tmPrice;
    //教材出版社
    private String tmPress;
    //教材图片路径
    private String tmImagespath;
    //创建时间
    private Date createdtime;
    //是否失效，0-不是，1-是
    private String tmStatus;
    //get set 方法
    public void setTmId (String  tmId){
        this.tmId=tmId;
    }
    public  String getTmId(){
        return this.tmId;
    }
    public void setTmTypeId (String  tmTypeId){
        this.tmTypeId=tmTypeId;
    }
    public  String getTmTypeId(){
        return this.tmTypeId;
    }
    public void setTmName (String  tmName){
        this.tmName=tmName;
    }
    public  String getTmName(){
        return this.tmName;
    }
    public void setTmNumber (String  tmNumber){
        this.tmNumber=tmNumber;
    }
    public  String getTmNumber(){
        return this.tmNumber;
    }
    public void setTmPageNumber (String  tmPageNumber){
        this.tmPageNumber=tmPageNumber;
    }
    public  String getTmPageNumber(){
        return this.tmPageNumber;
    }
    public void setTmPrice (String  tmPrice){
        this.tmPrice=tmPrice;
    }
    public  String getTmPrice(){
        return this.tmPrice;
    }
    public void setTmPress (String  tmPress){
        this.tmPress=tmPress;
    }
    public  String getTmPress(){
        return this.tmPress;
    }
    public void setTmImagespath (String  tmImagespath){
        this.tmImagespath=tmImagespath;
    }
    public  String getTmImagespath(){
        return this.tmImagespath;
    }
    public void setCreatedtime (Date  createdtime){
        this.createdtime=createdtime;
    }
    public  Date getCreatedtime(){
        return this.createdtime;
    }
    public void setTmStatus (String  tmStatus){
        this.tmStatus=tmStatus;
    }
    public  String getTmStatus(){
        return this.tmStatus;
    }
}
