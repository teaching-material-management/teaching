package com.system.teaching_material.mapper;
import com.system.teaching_material.pojo.TeachingMaterialConten;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeachingMaterialContenMapper {

	public TeachingMaterialConten getTeachingMaterialContenById(@Param(value = "id") String id)throws Exception;

	public List<TeachingMaterialConten>	getTeachingMaterialContenListByMap(Map<String, Object> param)throws Exception;

	public Integer getTeachingMaterialContenCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertTeachingMaterialConten(TeachingMaterialConten teachingMaterialConten)throws Exception;

	public Integer updateTeachingMaterialConten(TeachingMaterialConten teachingMaterialConten)throws Exception;

	public Integer deleteTeachingMaterialContenById(@Param(value = "id") String id)throws Exception;

	public Integer batchDeleteTeachingMaterialConten(Map<String, List<String>> params);

}
