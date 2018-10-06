package com.test;

import com.wyj.loginAPI;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by wyjsky on 2018/10/4.
 */


public class Test1 {
    private loginAPI login;

    public static void main(String[] args){
        System.out.print("test1");
    }

    @BeforeSuite(alwaysRun = true)
    public void loginInit() throws Exception{

        login=new loginAPI();
        System.out.println("init");

    }

//    @DataProvider(name = "dataProvider_login")
//    private Object[][] dataProvider_login() throws Exception{
//        return null;
//    }

//    @Test(enabled=true, priority=1,groups = {"high"},dataProvider = "dataProvider_login")
    @Test
    public void testTest1()throws Exception{

        System.out.println("dataprovider");
        String result = login.getLogin();
        System.out.println(result);

    }


    @AfterClass(alwaysRun=true)
    public void closeSession() throws Exception{
        System.out.print("close");

    }


}




