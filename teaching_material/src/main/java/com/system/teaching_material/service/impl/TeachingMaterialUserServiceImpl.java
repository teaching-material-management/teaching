package com.system.teaching_material.service.impl;

import com.system.teaching_material.pojo.TeachingMaterialUser;
import com.system.teaching_material.service.TeachingMaterialUserService;
import com.system.teaching_material.mapper.TeachingMaterialUserMapper;import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Service
public class TeachingMaterialUserServiceImpl implements TeachingMaterialUserService {

    @Resource
    private TeachingMaterialUserMapper teachingMaterialUserMapper;

    public TeachingMaterialUser getTeachingMaterialUserById(String id)throws Exception{
        return teachingMaterialUserMapper.getTeachingMaterialUserById(id);
    }

    public List<TeachingMaterialUser>	getTeachingMaterialUserListByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialUserMapper.getTeachingMaterialUserListByMap(param);
    }

    public Integer getTeachingMaterialUserCountByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialUserMapper.getTeachingMaterialUserCountByMap(param);
    }

    public Integer qdtxAddTeachingMaterialUser(TeachingMaterialUser teachingMaterialUser)throws Exception{
            //teachingMaterialUser.setCreatedTime(new Date());
            return teachingMaterialUserMapper.insertTeachingMaterialUser(teachingMaterialUser);
    }

    public Integer qdtxModifyTeachingMaterialUser(TeachingMaterialUser teachingMaterialUser)throws Exception{
        //teachingMaterialUser.setUpdatedTime(new Date());
        return teachingMaterialUserMapper.updateTeachingMaterialUser(teachingMaterialUser);
    }

    public Integer qdtxDeleteTeachingMaterialUserById(String id)throws Exception{
        return teachingMaterialUserMapper.deleteTeachingMaterialUserById(id);
    }

    public Integer qdtxBatchDeleteTeachingMaterialUser(String ids)throws Exception{
        Map<String,List<String>> param=new HashMap<String,List<String>>();
        String[] paramArrays=ids.split(",");
        List<String> idList=new ArrayList<String>();
            for (String temp:paramArrays){
                idList.add(temp);
            }
        param.put("ids",idList);
        return teachingMaterialUserMapper.batchDeleteTeachingMaterialUser(param);
    }


}
