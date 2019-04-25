package com.system.teaching_material.mapper;
import com.system.teaching_material.pojo.TeachingMaterialWheelPlanting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

@Mapper
public interface TeachingMaterialWheelPlantingMapper {

	public TeachingMaterialWheelPlanting getTeachingMaterialWheelPlantingById(@Param(value = "id") String id)throws Exception;

	public List<TeachingMaterialWheelPlanting>	getTeachingMaterialWheelPlantingListByMap(Map<String, Object> param)throws Exception;

	public Integer getTeachingMaterialWheelPlantingCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertTeachingMaterialWheelPlanting(TeachingMaterialWheelPlanting teachingMaterialWheelPlanting)throws Exception;

	public Integer updateTeachingMaterialWheelPlanting(TeachingMaterialWheelPlanting teachingMaterialWheelPlanting)throws Exception;

	public Integer deleteTeachingMaterialWheelPlantingById(@Param(value = "id") String id)throws Exception;

	public Integer batchDeleteTeachingMaterialWheelPlanting(Map<String, List<String>> params);

}
