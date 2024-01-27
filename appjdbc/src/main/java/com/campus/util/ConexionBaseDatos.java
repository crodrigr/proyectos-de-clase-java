package com.campus.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

    private static String url="jdbc:mysql://localhost:3308/dabase_factura";
    private static String username="root";
    private static String password="admin";
    private static Connection conection;

    private ConexionBaseDatos(){
        
    }

    public static Connection getInstance()throws SQLException{
        if(conection==null){
            conection=DriverManager.getConnection(url,username,password);            
        }
        return conection;
    }

    
    
}
