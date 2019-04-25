package com.system.teaching_material.service;
import com.system.teaching_material.pojo.TeachingMaterialType;
import java.util.Date;
import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface TeachingMaterialTypeService {

    public TeachingMaterialType getTeachingMaterialTypeById(String id)throws Exception;

    public List<TeachingMaterialType>	getTeachingMaterialTypeListByMap(Map<String,Object> param)throws Exception;

    public Integer getTeachingMaterialTypeCountByMap(Map<String,Object> param)throws Exception;

    public Integer qdtxAddTeachingMaterialType(TeachingMaterialType teachingMaterialType)throws Exception;

    public Integer qdtxModifyTeachingMaterialType(TeachingMaterialType teachingMaterialType)throws Exception;

    public Integer qdtxDeleteTeachingMaterialTypeById(String id)throws Exception;

    public Integer qdtxBatchDeleteTeachingMaterialType(String ids)throws Exception;

}
