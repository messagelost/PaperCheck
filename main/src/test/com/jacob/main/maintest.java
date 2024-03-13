package com.jacob.main;

import com.jacob.util.hammingutil;
import com.jacob.util.simhash;
import com.jacob.util.txtio;
import org.junit.Test;

public class maintest {


    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        str[1] = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_add.txt");
        str[2] = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_del.txt");
        str[3] = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_dis_1.txt");
        str[4] = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_dis_10.txt");
        str[5] = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_dis_15.txt");
        String ansFileName = "C:/Users/16921/Desktop/testtxt/result.txt";
        for(int i = 0; i <= 5; i++){
            double ans = hammingutil.getSimilarity(simhash.getSimHash(str[0]), simhash.getSimHash(str[i]));
            txtio.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        String str1 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        String ansFileName = "C:/Users/16921/Desktop/testtxt/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        String str1 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_add.txt");
        String ansFileName = "C:/Users/16921/Desktop/testtxt/orig_0.8_add.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        String str1 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_del.txt");
        String ansFileName = "C:/Users/16921/Desktop/testtxt/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDisTest(){
        String str0 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        String str1 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_dis_1.txt");
        String ansFileName = "C:/Users/16921/Desktop/testtxt/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        String str1 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_dis_10.txt");
        String ansFileName = "C:/Users/16921/Desktop/testtxt/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddDia15Test(){
        String str0 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig.txt");
        String str1 = txtio.readTxt("C:/Users/16921/Desktop/testtxt/orig_0.8_dis_15.txt");
        String ansFileName = "C:/Users/16921/Desktop/testtxt/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }
}
