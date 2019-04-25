package com.system.teaching_material.service;
import com.system.teaching_material.pojo.TeachingMaterialConten;

import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface TeachingMaterialContenService {

    public TeachingMaterialConten getTeachingMaterialContenById(String id)throws Exception;

    public List<TeachingMaterialConten>	getTeachingMaterialContenListByMap(Map<String,Object> param)throws Exception;

    public Integer getTeachingMaterialContenCountByMap(Map<String,Object> param)throws Exception;

    public Integer qdtxAddTeachingMaterialConten(TeachingMaterialConten teachingMaterialConten)throws Exception;

    public Integer qdtxModifyTeachingMaterialConten(TeachingMaterialConten teachingMaterialConten)throws Exception;

    public Integer qdtxDeleteTeachingMaterialContenById(String id)throws Exception;

    public Integer qdtxBatchDeleteTeachingMaterialConten(String ids)throws Exception;

}
