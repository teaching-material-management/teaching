package com.system.teaching_material;

import com.system.teaching_material.mapper.TeachingMaterialUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeachingMaterialApplicationTests {


    @Autowired
    private TeachingMaterialUserMapper teachingMaterialUserMapper;

    @Test
    public void contextLoads() {
        Integer count = teachingMaterialUserMapper.updateUserPasswordByPhone("345","15678999877");
        if(count > 0){
            System.out.println("修改成功");
        }
        System.out.println("aaa");
    }

}
