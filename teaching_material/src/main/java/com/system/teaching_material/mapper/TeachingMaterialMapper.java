package com.system.teaching_material.mapper;
import com.system.teaching_material.pojo.TeachingMaterial;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeachingMaterialMapper {

	public TeachingMaterial getTeachingMaterialById(@Param(value = "id") String id)throws Exception;

	public List<TeachingMaterial>	getTeachingMaterialListByMap(Map<String, Object> param)throws Exception;

	public Integer getTeachingMaterialCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertTeachingMaterial(TeachingMaterial teachingMaterial)throws Exception;

	public Integer updateTeachingMaterial(TeachingMaterial teachingMaterial)throws Exception;

	public Integer deleteTeachingMaterialById(@Param(value = "id") String id)throws Exception;

	public Integer batchDeleteTeachingMaterial(Map<String, List<String>> params);

}
