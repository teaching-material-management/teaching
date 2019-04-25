package com.system.teaching_material.pojo;
import java.io.Serializable;
/***
*   
*/
public class TeachingMaterialConten implements Serializable {
    //教材内容id
    private String tmContentId;
    //教材内容标题
    private String tmContenTitle;
    //用途：0-普通内容，1-素材内容
    private String tmContenPurpose;
    //权重，越小越靠前（0-3）
    private String tmContenWeight;
    //是否失效，0-是，1-否
    private String tmContenIsinvalid;
    //素材内容，素材链接
    private String tmContenLink;
    //内容
    private String tmContenText;
    //创建时间
    private String createdtime;
    //所属教材id
    private String tmId;
    //get set 方法
    public void setTmContentId (String  tmContentId){
        this.tmContentId=tmContentId;
    }
    public  String getTmContentId(){
        return this.tmContentId;
    }
    public void setTmContenTitle (String  tmContenTitle){
        this.tmContenTitle=tmContenTitle;
    }
    public  String getTmContenTitle(){
        return this.tmContenTitle;
    }
    public void setTmContenPurpose (String  tmContenPurpose){
        this.tmContenPurpose=tmContenPurpose;
    }
    public  String getTmContenPurpose(){
        return this.tmContenPurpose;
    }
    public void setTmContenWeight (String  tmContenWeight){
        this.tmContenWeight=tmContenWeight;
    }
    public  String getTmContenWeight(){
        return this.tmContenWeight;
    }
    public void setTmContenIsinvalid (String  tmContenIsinvalid){
        this.tmContenIsinvalid=tmContenIsinvalid;
    }
    public  String getTmContenIsinvalid(){
        return this.tmContenIsinvalid;
    }
    public void setTmContenLink (String  tmContenLink){
        this.tmContenLink=tmContenLink;
    }
    public  String getTmContenLink(){
        return this.tmContenLink;
    }
    public void setTmContenText (String  tmContenText){
        this.tmContenText=tmContenText;
    }
    public  String getTmContenText(){
        return this.tmContenText;
    }
    public void setCreatedtime (String  createdtime){
        this.createdtime=createdtime;
    }
    public  String getCreatedtime(){
        return this.createdtime;
    }
    public void setTmId (String  tmId){
        this.tmId=tmId;
    }
    public  String getTmId(){
        return this.tmId;
    }
}
