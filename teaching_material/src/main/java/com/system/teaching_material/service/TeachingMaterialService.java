package com.system.teaching_material.service;
import com.system.teaching_material.pojo.TeachingMaterial;

import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface TeachingMaterialService {

    public TeachingMaterial getTeachingMaterialById(String id)throws Exception;

    public List<TeachingMaterial>	getTeachingMaterialListByMap(Map<String,Object> param)throws Exception;

    public Integer getTeachingMaterialCountByMap(Map<String,Object> param)throws Exception;

    public Integer qdtxAddTeachingMaterial(TeachingMaterial teachingMaterial)throws Exception;

    public Integer qdtxModifyTeachingMaterial(TeachingMaterial teachingMaterial)throws Exception;

    public Integer qdtxDeleteTeachingMaterialById(String id)throws Exception;

    public Integer qdtxBatchDeleteTeachingMaterial(String ids)throws Exception;

}
