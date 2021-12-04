/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author Ahmed
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/lms" , "root" ,"ahmed0704");
            return con;
        }catch(Exception e){
            System.out.println("exception/error in connection occured ==> "+ e);
            return null;
        }
    }
}
