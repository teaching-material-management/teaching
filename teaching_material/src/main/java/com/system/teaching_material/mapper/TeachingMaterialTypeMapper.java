package com.system.teaching_material.mapper;
import com.system.teaching_material.pojo.TeachingMaterialType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeachingMaterialTypeMapper {

	public TeachingMaterialType getTeachingMaterialTypeById(@Param(value = "id") String id)throws Exception;

	public List<TeachingMaterialType>	getTeachingMaterialTypeListByMap(Map<String, Object> param)throws Exception;

	public Integer getTeachingMaterialTypeCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertTeachingMaterialType(TeachingMaterialType teachingMaterialType)throws Exception;

	public Integer updateTeachingMaterialType(TeachingMaterialType teachingMaterialType)throws Exception;

	public Integer deleteTeachingMaterialTypeById(@Param(value = "id") String id)throws Exception;

	public Integer batchDeleteTeachingMaterialType(Map<String, List<String>> params);

}
