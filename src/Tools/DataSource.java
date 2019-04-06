/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author asus
 */

public class DataSource {
    private static final String url = "jdbc:mysql://localhost:3306/integree?useSSL=true";
    private static final  String user = "root";
    private static final String passwd = "thuglife";
    private static Connection connexion = null;

    private DataSource(){
    
    }

public static Connection dbConnexion() {
    if (connexion == null) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        connexion = DriverManager.getConnection(url, user, passwd);
        System.out.println("Connection Established For the first time");
        return connexion;
    } catch (SQLException SQLe) {
        SQLe.printStackTrace();
    } catch (ClassNotFoundException CnFe) {
        CnFe.printStackTrace();
    }
    }else{
       System.out.println("Connection Established For the 2nd time");
    return connexion;

    }
return null;
    }

public static void dbDisconnect () throws SQLException{
    try{
        if (connexion != null && !connexion.isClosed())
        {
            connexion.close();
        }
    }
    catch (SQLException SQLe) {
        SQLe.printStackTrace();
    }
        
    }
}

            

