package com.abc.dao;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class registration {
    public static int register(String userid, String userpass, String fname, String lname, String uname, InputStream photo) 
    {        
        Connection conn = null;
        PreparedStatement pst = null;
        int rs = -1;

        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "webtest";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "qwerty";
        try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, userName, password);
            pst = conn.prepareStatement("insert into userdetails (userid,userpass,fname,lname,uname,photo) values(?,?,?,?,?,?)");
            pst.setString(1, userid);
            pst.setString(2, userpass);
            pst.setString(3, fname);
            pst.setString(4, lname);
            pst.setString(5, uname);
			if (photo != null) 
            {
            	   pst.setBlob(6, photo);
            }
            
            rs = pst.executeUpdate();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        } 
        finally 
        {
            if (conn != null)
            {
                try 
                {
                    conn.close();
                }
                catch (SQLException e) 
                {
                    e.printStackTrace();
                }
            }
            if (pst != null)
            {
                try
                {
                    pst.close();
                } 
                catch (SQLException e) 
                   {
                    e.printStackTrace();
                     }
            }
        }
        return rs;
    }
}