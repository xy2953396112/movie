package com.movie.Utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCUtlTool {
    public static Connection getConnection(){  
        String driver="com.mysql.jdbc.Driver";   //获取mysql数据库的驱动类  
        String url="jdbc:mysql://localhost:3306/mysql"; //连接数据库（kucun是数据库名）
        String name="root";//连接mysql的用户名  
        String pwd="root";//连接mysql的密码
        try{  
            Class.forName(driver);  
            Connection conn=DriverManager.getConnection(url,name,pwd);//获取连接对象  
            return conn;  
        }catch(ClassNotFoundException e){  
            e.printStackTrace();  
            return null;  
        }catch(SQLException e){  
            e.printStackTrace();  
            return null;  
        }  
    }  
      

    @Test
    public  void main() throws SQLException
    {  
          
        Connection cc=JDBCUtlTool.getConnection();  
          
       System.out.println(cc);
  
  
    }  
}  