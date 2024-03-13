package com.jacob.util;

import org.junit.Test;

public class txtiotest {


    @Test
    public void readTxtTest() {
        // 路径存在，正常读取
        String str = com.jacob.util.txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            com.jacob.util.txtio.writeTxt(elem[i], "C:/Users/16921/Desktop/testtxt/ans.txt");
        }
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = com.jacob.util.txtio.readTxt("C:/Users/16921/Desktop/testtxt/none.txt");
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            com.jacob.util.txtio.writeTxt(elem[i], "Users/16921/Desktop/testtxt/ans.txt");
        }
    }

}
