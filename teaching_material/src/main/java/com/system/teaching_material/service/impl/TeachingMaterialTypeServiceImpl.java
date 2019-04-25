package com.system.teaching_material.service.impl;

import com.system.teaching_material.pojo.TeachingMaterialType;
import com.system.teaching_material.service.TeachingMaterialTypeService;
import com.system.teaching_material.mapper.TeachingMaterialTypeMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Service
public class TeachingMaterialTypeServiceImpl implements TeachingMaterialTypeService {

    @Resource
    private TeachingMaterialTypeMapper teachingMaterialTypeMapper;

    public TeachingMaterialType getTeachingMaterialTypeById(String id)throws Exception{
        return teachingMaterialTypeMapper.getTeachingMaterialTypeById(id);
    }

    public List<TeachingMaterialType>	getTeachingMaterialTypeListByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialTypeMapper.getTeachingMaterialTypeListByMap(param);
    }

    public Integer getTeachingMaterialTypeCountByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialTypeMapper.getTeachingMaterialTypeCountByMap(param);
    }

    public Integer qdtxAddTeachingMaterialType(TeachingMaterialType teachingMaterialType)throws Exception{
            //teachingMaterialType.setCreatedTime(new Date());
            return teachingMaterialTypeMapper.insertTeachingMaterialType(teachingMaterialType);
    }

    public Integer qdtxModifyTeachingMaterialType(TeachingMaterialType teachingMaterialType)throws Exception{
        //teachingMaterialType.setUpdatedTime(new Date());
        return teachingMaterialTypeMapper.updateTeachingMaterialType(teachingMaterialType);
    }

    public Integer qdtxDeleteTeachingMaterialTypeById(String id)throws Exception{
        return teachingMaterialTypeMapper.deleteTeachingMaterialTypeById(id);
    }

    public Integer qdtxBatchDeleteTeachingMaterialType(String ids)throws Exception{
        Map<String,List<String>> param=new HashMap<String,List<String>>();
        String[] paramArrays=ids.split(",");
        List<String> idList=new ArrayList<String>();
            for (String temp:paramArrays){
                idList.add(temp);
            }
        param.put("ids",idList);
        return teachingMaterialTypeMapper.batchDeleteTeachingMaterialType(param);
    }


}
