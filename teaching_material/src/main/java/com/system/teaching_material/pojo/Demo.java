package com.system.teaching_material.pojo;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: CuiJunJia
 * @Date: 2019-04-26 14:38
 * @Deprecated: 面试题
 */
@Slf4j
public class Demo {
    //1. 如果参数是 List 类型的话,在下面就不能转换为 LinkedList, List 不能强转 LinkedList 改用为 ArrayList
    public static void Execute(ArrayList<String> list,String type){
        LinkedList<String> linked_list = new LinkedList(list);
        try {
            //优化
            //2. 在if语句中,是执行逻辑判断的, 在判断常量时,switch(不能执行逻辑判断) 效率高于 if
            switch (type){
                case "0":
                    linked_list.addFirst("U0");
                    break;
                case "1":
                    linked_list.addFirst("U1");
                    break;
                case "2":
                    linked_list.addFirst("U2");
                    break;
                case "3":
                    linked_list.addFirst("U3");
                    break;
                case "4":
                    linked_list.addFirst("U4");
                    break;
            }
        }catch (Exception e){
            log.info("新增数据异常,{}",e.getMessage());
        }
        //3.  Arrays.asList()方法返回的ArrayList。
        // 它是Arrays类自己定义的一个内部类！这个内部类没有实现add()、remove()方法，
        // 而是直接使用它的父类AbstractList的相应方法。
        // 它仅支持那些不会改变数组大小的操作，所以任何对底层数据结构的尺寸进行修改的方法都会出现异常，
        // Arrays.asList()返回固定尺寸的List。

        //  修改如下--利用ArrayList 构造
        List<String> list1 = new ArrayList<String>(Arrays.asList("U5","U6","U7"));
        list1.add("U8");
    }
}
