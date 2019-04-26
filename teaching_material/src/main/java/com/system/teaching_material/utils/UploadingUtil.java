package com.system.teaching_material.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UploadingUtil{

    public String fileUpload(List<MultipartFile> files,String path){
        if(files.isEmpty()){
            return "上传的文件有错误";
        }
        String[] lastNames = {"zip" , "rar" , "7z" , "mp4" , "avi" , "ppt" , "pptx" , "doc" , "docx"};
        for (MultipartFile file : files){
            String fileName = file.getOriginalFilename();
            if (file.isEmpty()){
                return "上传的文件有问题";
            }
            int index = fileName.lastIndexOf(".");
            String lastFileName = fileName.substring(index);
            for (String lastName : lastNames) {
                if(!lastName.equals(lastFileName)){
                    return "上传的文件格式不对，请上传我们认识的文件格式";
                }
            }
//            if(lastFileName.equals(".zip")&&lastFileName.equals(".rar")&&lastFileName.equals(".7z")&&lastFileName){
//
//            }
            File dest = new File(path + "/" + fileName);
            //判断父级路径是否存在
            if(dest.getParentFile().exists()){
                //如果不存在就新建路径
                dest.getParentFile().mkdir();
            }
            try {
                file.transferTo(dest);
            } catch (IOException e) {
                e.printStackTrace();
                return "上传出现问题，请重试";
            }
        }
        return "上传成功";

    }
}
