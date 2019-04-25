package com.system.teaching_material.service.impl;

import com.system.teaching_material.pojo.TeachingMaterial;
import com.system.teaching_material.service.TeachingMaterialService;
import com.system.teaching_material.mapper.TeachingMaterialMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Service
public class TeachingMaterialServiceImpl implements TeachingMaterialService {

    @Resource
    private TeachingMaterialMapper teachingMaterialMapper;

    public TeachingMaterial getTeachingMaterialById(String id)throws Exception{
        return teachingMaterialMapper.getTeachingMaterialById(id);
    }

    public List<TeachingMaterial>	getTeachingMaterialListByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialMapper.getTeachingMaterialListByMap(param);
    }

    public Integer getTeachingMaterialCountByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialMapper.getTeachingMaterialCountByMap(param);
    }

    public Integer qdtxAddTeachingMaterial(TeachingMaterial teachingMaterial)throws Exception{
            //teachingMaterial.setCreatedTime(new Date());
            return teachingMaterialMapper.insertTeachingMaterial(teachingMaterial);
    }

    public Integer qdtxModifyTeachingMaterial(TeachingMaterial teachingMaterial)throws Exception{
        //teachingMaterial.setUpdatedTime(new Date());
        return teachingMaterialMapper.updateTeachingMaterial(teachingMaterial);
    }

    public Integer qdtxDeleteTeachingMaterialById(String id)throws Exception{
        return teachingMaterialMapper.deleteTeachingMaterialById(id);
    }

    public Integer qdtxBatchDeleteTeachingMaterial(String ids)throws Exception{
        Map<String,List<String>> param=new HashMap<String,List<String>>();
        String[] paramArrays=ids.split(",");
        List<String> idList=new ArrayList<String>();
            for (String temp:paramArrays){
                idList.add(temp);
            }
        param.put("ids",idList);
        return teachingMaterialMapper.batchDeleteTeachingMaterial(param);
    }


}
