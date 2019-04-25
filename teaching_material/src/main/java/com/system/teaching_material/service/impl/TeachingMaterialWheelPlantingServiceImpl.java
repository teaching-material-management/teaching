package com.system.teaching_material.service.impl;

import com.system.teaching_material.pojo.TeachingMaterialWheelPlanting;
import com.system.teaching_material.service.TeachingMaterialWheelPlantingService;
import com.system.teaching_material.mapper.TeachingMaterialWheelPlantingMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Service
public class TeachingMaterialWheelPlantingServiceImpl implements TeachingMaterialWheelPlantingService {

    @Resource
    private TeachingMaterialWheelPlantingMapper teachingMaterialWheelPlantingMapper;

    public TeachingMaterialWheelPlanting getTeachingMaterialWheelPlantingById(String id)throws Exception{
        return teachingMaterialWheelPlantingMapper.getTeachingMaterialWheelPlantingById(id);
    }

    public List<TeachingMaterialWheelPlanting>	getTeachingMaterialWheelPlantingListByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialWheelPlantingMapper.getTeachingMaterialWheelPlantingListByMap(param);
    }

    public Integer getTeachingMaterialWheelPlantingCountByMap(Map<String,Object> param)throws Exception{
        return teachingMaterialWheelPlantingMapper.getTeachingMaterialWheelPlantingCountByMap(param);
    }

    public Integer qdtxAddTeachingMaterialWheelPlanting(TeachingMaterialWheelPlanting teachingMaterialWheelPlanting)throws Exception{
            //teachingMaterialWheelPlanting.setCreatedTime(new Date());
            return teachingMaterialWheelPlantingMapper.insertTeachingMaterialWheelPlanting(teachingMaterialWheelPlanting);
    }

    public Integer qdtxModifyTeachingMaterialWheelPlanting(TeachingMaterialWheelPlanting teachingMaterialWheelPlanting)throws Exception{
        //teachingMaterialWheelPlanting.setUpdatedTime(new Date());
        return teachingMaterialWheelPlantingMapper.updateTeachingMaterialWheelPlanting(teachingMaterialWheelPlanting);
    }

    public Integer qdtxDeleteTeachingMaterialWheelPlantingById(String id)throws Exception{
        return teachingMaterialWheelPlantingMapper.deleteTeachingMaterialWheelPlantingById(id);
    }

    public Integer qdtxBatchDeleteTeachingMaterialWheelPlanting(String ids)throws Exception{
        Map<String,List<String>> param=new HashMap<String,List<String>>();
        String[] paramArrays=ids.split(",");
        List<String> idList=new ArrayList<String>();
            for (String temp:paramArrays){
                idList.add(temp);
            }
        param.put("ids",idList);
        return teachingMaterialWheelPlantingMapper.batchDeleteTeachingMaterialWheelPlanting(param);
    }


}
