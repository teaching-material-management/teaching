package com.system.teaching_material.service;
import com.system.teaching_material.pojo.TeachingMaterialUser;

import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface TeachingMaterialUserService {

    public TeachingMaterialUser getTeachingMaterialUserById(String id)throws Exception;

    public List<TeachingMaterialUser>	getTeachingMaterialUserListByMap(Map<String,Object> param)throws Exception;

    public Integer getTeachingMaterialUserCountByMap(Map<String,Object> param)throws Exception;

    public Integer qdtxAddTeachingMaterialUser(TeachingMaterialUser teachingMaterialUser)throws Exception;

    public Integer qdtxModifyTeachingMaterialUser(TeachingMaterialUser teachingMaterialUser)throws Exception;

    public Integer qdtxDeleteTeachingMaterialUserById(String id)throws Exception;

    public Integer qdtxBatchDeleteTeachingMaterialUser(String ids)throws Exception;

}
