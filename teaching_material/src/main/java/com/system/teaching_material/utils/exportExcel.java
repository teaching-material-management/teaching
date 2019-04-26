package com.system.teaching_material.utils;


import com.system.teaching_material.pojo.TeachingMaterialUser;
import org.apache.poi.hssf.usermodel.*;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
//导出execl文件工具类
public class exportExcel {
    /**
     * @param sheetName 表名
     * @param header 表头数据
     * @param userList 主干数据 body.get(i) 对应 i+1行的所有数据
     */
    public static void generateExcel(String sheetName, String[] header, List<TeachingMaterialUser> userList, OutputStream out) {
        //新建excel报表
        HSSFWorkbook excel = new HSSFWorkbook();
        //添加一个sheet
        HSSFSheet sheet = excel.createSheet(sheetName);
        HSSFFont font = excel.createFont();//创建字体样式
        font.setFontName("宋体");//使用宋体

        //然后创建单元格样式style
        HSSFCellStyle style = excel.createCellStyle();
        style.setFont(font);//将字体注入
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中    
        //往excel表格创建一行，excel的行号是从0开始的
        // 设置表头
        HSSFRow firstRow = sheet.createRow(0);
        for (int columnNum = 0; columnNum < header.length; columnNum ++) {
            //创建单元格
            HSSFCell hssfCell = firstRow.createCell(columnNum);
            //设置单元格的值
            hssfCell.setCellValue(header.length < columnNum ? "-" : header[columnNum]);
            hssfCell.setCellStyle(style);
        }
        // 设置主体数据

        sheet.autoSizeColumn(12);
        //4.操作单元格;将用户列表写入excel
        if(userList != null)
        {
            for(int j=0;j<userList.size();j++)
            {

                //创建数据行,前面有两行,头标题行和列标题行
                HSSFRow row = sheet.createRow(j+1);

                HSSFCell cell1 = row.createCell(0);
                cell1.setCellValue(userList.get(j).getUserId());
                cell1.setCellStyle(style);

                HSSFCell cell2 = row.createCell(1);
                cell2.setCellValue(userList.get(j).getUserNick());
                cell2.setCellStyle(style);

                HSSFCell cell3 = row.createCell(2);
                cell3.setCellValue(userList.get(j).getUserToken());
                cell3.setCellStyle(style);

                HSSFCell cell4 = row.createCell(3);
                cell4.setCellValue(userList.get(j).getCraetedtime());
                cell4.setCellStyle(style);
                sheet.setColumnWidth(3,13*256);
            }
        }
        try {
            excel.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
