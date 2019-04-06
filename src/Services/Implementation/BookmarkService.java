/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Entities.Project;
import Entities.User;
import Services.Interface.BookmarkServiceInterface;
import Tools.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class BookmarkService implements BookmarkServiceInterface{
     private static PreparedStatement preparedStatement;
    private static Statement statement;
    private static ResultSet resultSet;
    Connection cnx = DataSource.dbConnexion();   
    private static final Logger logger = Logger.getLogger(AuthenticationService.class.getName());
    @Override
    public boolean addBookmark(Project project, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteBookmark(Project project, User user) {
            try{
            //cnx.setAutoCommit(false);
            String query = "DELETE FROM bookmark WHERE project_id = ? AND freelancer_id = ?";
            preparedStatement = cnx.prepareStatement(query);
            //preparedStatement.addBatch();
            //preparedStatement.executeBatch();
            int counter = 1;            
            preparedStatement.setInt(counter++, project.getId());
            preparedStatement.setInt(counter++, user.getId());
            if (preparedStatement.executeUpdate() > 0 )
                return true;
            else
                return false;

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

        return false;    
    
}
}
    

