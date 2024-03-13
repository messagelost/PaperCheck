package com.jacob.util;

import org.junit.Test;

public class simhashtest {

    @Test
    public void getHashTest(){
        String[] strings = {"与", "世上", "众人", "的", "路径", "相反"};
        for (String string : strings) {
            String stringHash = com.jacob.util.simhash.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = com.jacob.util.txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        String str1 = com.jacob.util.txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_add.txt");
        System.out.println(com.jacob.util.simhash.getSimHash(str0));
        System.out.println(com.jacob.util.simhash.getSimHash(str1));
    }

}
