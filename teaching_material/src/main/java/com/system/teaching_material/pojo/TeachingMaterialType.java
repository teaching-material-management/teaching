package com.system.teaching_material.pojo;
import java.io.Serializable;
/***
*   
*/
public class TeachingMaterialType implements Serializable {
    //教材分类id
    private String tmTypeId;
    //教材分类名称
    private String tmTypeName;
    //是否有效:0-无，1-有
    private String tmTypeIseffective;
    //是否发布:0-无，1-有
    private String tmTypeIsrelease;
    //是否审核:0-无，1-有
    private String tmTypeIsexamine;
    //图片路径
    private String tmTypeImagepath;
    //权重（越小越靠前）
    private String tmTypeWeight;
    //get set 方法
    public void setTmTypeId (String  tmTypeId){
        this.tmTypeId=tmTypeId;
    }
    public  String getTmTypeId(){
        return this.tmTypeId;
    }
    public void setTmTypeName (String  tmTypeName){
        this.tmTypeName=tmTypeName;
    }
    public  String getTmTypeName(){
        return this.tmTypeName;
    }
    public void setTmTypeIseffective (String  tmTypeIseffective){
        this.tmTypeIseffective=tmTypeIseffective;
    }
    public  String getTmTypeIseffective(){
        return this.tmTypeIseffective;
    }
    public void setTmTypeIsrelease (String  tmTypeIsrelease){
        this.tmTypeIsrelease=tmTypeIsrelease;
    }
    public  String getTmTypeIsrelease(){
        return this.tmTypeIsrelease;
    }
    public void setTmTypeIsexamine (String  tmTypeIsexamine){
        this.tmTypeIsexamine=tmTypeIsexamine;
    }
    public  String getTmTypeIsexamine(){
        return this.tmTypeIsexamine;
    }
    public void setTmTypeImagepath (String  tmTypeImagepath){
        this.tmTypeImagepath=tmTypeImagepath;
    }
    public  String getTmTypeImagepath(){
        return this.tmTypeImagepath;
    }
    public void setTmTypeWeight (String  tmTypeWeight){
        this.tmTypeWeight=tmTypeWeight;
    }
    public  String getTmTypeWeight(){
        return this.tmTypeWeight;
    }
}
