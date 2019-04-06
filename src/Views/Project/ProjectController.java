/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Project;

import Views.Bid.*;
import Tools.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author asus
 */
public class ProjectController {
    private Statement statement;
    private ResultSet result;
    Connection cnx = DataSource.dbConnexion();


    
    public void bidList(DataSource singleton){
    try {
        statement = cnx.createStatement();
                            while (result.next()) {
                                    for (int i = 1; i <= 5; i++)
                                            System.out.print("\t" + result.getObject(i).toString()
                                                            + "\t |");
                            }
                            statement.close();
                            result.close();
                    } catch (Exception e) {
                            e.printStackTrace();
                    }
                    finally {
        // it is a good idea to release
        // resources in a finally{} block
        // in reverse-order of their creation
        // if they are no-longer needed

        if (result != null) {
            try {
                result.close();
            }catch (Exception e) {
                            e.printStackTrace();
            }

            result = null;
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e) {
                            e.printStackTrace();
            }

            statement = null;
        }
            }
        }
    
}
