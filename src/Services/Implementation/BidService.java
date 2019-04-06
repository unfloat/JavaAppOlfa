/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Entities.Bid;
import Services.Interface.BidServiceInterface;
import Tools.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class BidService implements BidServiceInterface{
    private static PreparedStatement preparedStatement;
    private static Statement statement;
    private static ResultSet resultSet;
    Connection cnx = DataSource.dbConnexion();   
    private static final Logger logger = Logger.getLogger(AuthenticationService.class.getName());
    
    

    
    @Override
    public String displayBids() {
        try{
    	cnx.setAutoCommit(false);
        String query = "SELECT * FROM bid";
        statement = cnx.createStatement();

        //int counter = 1;            
        //preparedStatement.setString(counter++, email);
        //preparedStatement.setString(counter++, username);
        resultSet = statement.executeQuery(query);
        ResultSetMetaData resultMetaData = resultSet.getMetaData();
        while (resultSet.next()) {
            
            for (int i = 1; i <= resultMetaData.getColumnCount(); i++) {
                //return "?";
                System.out.println(resultSet.getString(i));
            }
        }
            //return resultSet.next();
            //UserSession userSession = UserSession.getInstace(username, privileges);
            //return true;

        }catch (SQLException exception) {
            System.out.println(exception.getMessage());
			logger.log(Level.SEVERE, exception.getMessage());

    }
    return "false";
    }
        

    @Override
    public void addBid(Bid bid) {
    try{
    	//cnx.setAutoCommit(false);
        String query = "INSERT INTO bid VALUES (?,?,?,?) ";
        preparedStatement = cnx.prepareStatement(query);
        preparedStatement.addBatch();
        preparedStatement.executeBatch();
        int counter = 1;            
        //preparedStatement.setString(counter++, email);
        //preparedStatement.setString(counter++, username);
        //resultSet = preparedStatement.executeUpdate();
        
        }catch (SQLException exception) {
            System.out.println(exception.getMessage());
			logger.log(Level.SEVERE, exception.getMessage());

    } finally {
        if (preparedStatement!= null)
          try {
              preparedStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(BidService.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (cnx!= null)
          try {
              cnx.close();
        } catch (SQLException ex) {
            Logger.getLogger(BidService.class.getName()).log(Level.SEVERE, null, ex);
        }
      }

    //return false;
    }

    @Override
    public void deleteBid(int idBid) {
    try{
            //cnx.setAutoCommit(false);
            String query = "DELETE FROM bid WHERE id '" + idBid + "'";
            preparedStatement = cnx.prepareStatement(query);
            int counter = 1;            
            //preparedStatement.setString(counter++, email);
            //preparedStatement.setString(counter++, username);
            //resultSet = preparedStatement.executeUpdate();

            }catch (SQLException exception) {
                System.out.println(exception.getMessage());
                            logger.log(Level.SEVERE, exception.getMessage());

        } finally {
            if (preparedStatement!= null)
              try {
                  preparedStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(BidService.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (cnx!= null)
              try {
                  cnx.close();
            } catch (SQLException ex) {
                Logger.getLogger(BidService.class.getName()).log(Level.SEVERE, null, ex);
            }
          }

        //return false;    
        }

    @Override
    public void updateBid(int idBid) {
    try{
            //cnx.setAutoCommit(false);
            String query = "INSERT INTO bid VALUES (?,?,?,?) ";
            preparedStatement = cnx.prepareStatement(query);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            int counter = 1;            
            //preparedStatement.setString(counter++, email);
            //preparedStatement.setString(counter++, username);
            //resultSet = preparedStatement.executeUpdate();

            }catch (SQLException exception) {
                System.out.println(exception.getMessage());
                            logger.log(Level.SEVERE, exception.getMessage());

        } finally {
            if (preparedStatement!= null)
              try {
                  preparedStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(BidService.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (cnx!= null)
              try {
                  cnx.close();
            } catch (SQLException ex) {
                Logger.getLogger(BidService.class.getName()).log(Level.SEVERE, null, ex);
            }
          }

        //return false;
        }
    
}
