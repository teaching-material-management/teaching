package com.system.teaching_material.mapper;
import com.system.teaching_material.pojo.TeachingMaterialUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeachingMaterialUserMapper {

	public TeachingMaterialUser getTeachingMaterialUserById(@Param(value = "id") String id)throws Exception;

	public List<TeachingMaterialUser>	getTeachingMaterialUserListByMap(Map<String, Object> param)throws Exception;

	public Integer getTeachingMaterialUserCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertTeachingMaterialUser(TeachingMaterialUser teachingMaterialUser)throws Exception;

	public Integer updateTeachingMaterialUser(TeachingMaterialUser teachingMaterialUser)throws Exception;

	public Integer deleteTeachingMaterialUserById(@Param(value = "id") String id)throws Exception;

	public Integer batchDeleteTeachingMaterialUser(Map<String, List<String>> params);

	//找回密码之后修改密码
	Integer updateUserPasswordByPhone(@Param("password")String password,@Param("phone")String phone);

}
