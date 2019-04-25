package com.system.teaching_material.service.impl;

import com.system.teaching_material.pojo.TeachingMaterialConten;
import com.system.teaching_material.service.TeachingMaterialContenService;
import com.system.teaching_material.mapper.TeachingMaterialContenMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Service
public class TeachingMaterialContenServiceImpl implements TeachingMaterialContenService {

    @Resource
    private TeachingMaterialContenMapper teachingMaterialContenMapper;

    public TeachingMaterialConten getTeachingMaterialContenById(String id)throws Exception{
        return teachingMaterialContenMapper.getTeachingMaterialContenById(id);
    }

    public List<TeachingMaterialConten>	getTeachingMaterialContenListByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialContenMapper.getTeachingMaterialContenListByMap(param);
    }

    public Integer getTeachingMaterialContenCountByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialContenMapper.getTeachingMaterialContenCountByMap(param);
    }

    public Integer qdtxAddTeachingMaterialConten(TeachingMaterialConten teachingMaterialConten)throws Exception{
            //teachingMaterialConten.setCreatedTime(new Date());
            return teachingMaterialContenMapper.insertTeachingMaterialConten(teachingMaterialConten);
    }

    public Integer qdtxModifyTeachingMaterialConten(TeachingMaterialConten teachingMaterialConten)throws Exception{
        //teachingMaterialConten.setUpdatedTime(new Date());
        return teachingMaterialContenMapper.updateTeachingMaterialConten(teachingMaterialConten);
    }

    public Integer qdtxDeleteTeachingMaterialContenById(String id)throws Exception{
        return teachingMaterialContenMapper.deleteTeachingMaterialContenById(id);
    }

    public Integer qdtxBatchDeleteTeachingMaterialConten(String ids)throws Exception{
        Map<String,List<String>> param=new HashMap<String,List<String>>();
        String[] paramArrays=ids.split(",");
        List<String> idList=new ArrayList<String>();
            for (String temp:paramArrays){
                idList.add(temp);
            }
        param.put("ids",idList);
        return teachingMaterialContenMapper.batchDeleteTeachingMaterialConten(param);
    }


}
