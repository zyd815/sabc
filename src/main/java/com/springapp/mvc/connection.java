package com.springapp.mvc;

import com.springapp.mvc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ABCDC on 2016/8/15.
 */
public class connection {

    @Autowired static TestService testService;

    public static void main(String [] args){
        /*
        try{
            //加载MySql的驱动类
//            Class.forName("com.sybase.jdbc3.jdbc.SybDriver") ;
            Class.forName("net.sourceforge.jtds.jdbc.Driver") ;
        }catch(ClassNotFoundException e){
            System.out.println("找不到驱动程序类 ，加载驱动失败！");
            e.printStackTrace() ;
        }
//        String url = "jdbc:sybase:Tds:10.6.1.178:4200/ftzmiss" ;
        String url = "jdbc:jtds:sybase://10.6.1.178:4200/ftzmiss" ;
        String username = "ftzmiss" ;
        String password = "kfrbftzmiss" ;
        try{
            Connection con =
                    DriverManager.getConnection(url, username, password) ;
        }catch(SQLException se){
            System.out.println("数据库连接失败！");
            se.printStackTrace() ;
        }
        */
        testService.sayHello();
        System.out.println("hhhh");
    }

}
