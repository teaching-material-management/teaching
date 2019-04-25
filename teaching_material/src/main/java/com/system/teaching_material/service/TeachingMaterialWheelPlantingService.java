package com.system.teaching_material.service;
import com.system.teaching_material.pojo.TeachingMaterialWheelPlanting;

import java.util.List;
import java.util.Map;
/**
* Created by shang-pc on 2015/11/7.
*/
public interface TeachingMaterialWheelPlantingService {

    public TeachingMaterialWheelPlanting getTeachingMaterialWheelPlantingById(String id)throws Exception;

    public List<TeachingMaterialWheelPlanting>	getTeachingMaterialWheelPlantingListByMap(Map<String,Object> param)throws Exception;

    public Integer getTeachingMaterialWheelPlantingCountByMap(Map<String,Object> param)throws Exception;

    public Integer qdtxAddTeachingMaterialWheelPlanting(TeachingMaterialWheelPlanting teachingMaterialWheelPlanting)throws Exception;

    public Integer qdtxModifyTeachingMaterialWheelPlanting(TeachingMaterialWheelPlanting teachingMaterialWheelPlanting)throws Exception;

    public Integer qdtxDeleteTeachingMaterialWheelPlantingById(String id)throws Exception;

    public Integer qdtxBatchDeleteTeachingMaterialWheelPlanting(String ids)throws Exception;

}
