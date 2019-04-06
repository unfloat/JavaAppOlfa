/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Entities.User;
import Services.Interface.AuthenticationServiceInterface;
import Tools.DataSource;
import Tools.UserSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class AuthenticationService implements AuthenticationServiceInterface {

    private static AuthenticationService authenticationServiceInstance;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;
    Connection cnx = DataSource.dbConnexion();
    private static final Logger logger = Logger.getLogger(AuthenticationService.class.getName());

    private AuthenticationService() {
    }

    public static AuthenticationService getInstance() {
        if (authenticationServiceInstance == null) {
            authenticationServiceInstance = new AuthenticationService();
        }
        return authenticationServiceInstance;
    }

    @Override
    public String login(String email, String username) {
        try {
            cnx.setAutoCommit(false);
            String query = "SELECT * FROM fos_user WHERE email = ? AND username = ?";
            preparedStatement = cnx.prepareStatement(query);
            int counter = 1;
            preparedStatement.setString(counter++, email);
            preparedStatement.setString(counter++, username);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getObject("type").toString();
                //UserSession userSession = UserSession.getInstace(username, privileges);
                //return true;

            } else {
                return "pas de resultat";
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            logger.log(Level.SEVERE, exception.getMessage());

        }
        return "fuck";
    }

    @Override
    public String register(User user) {
        String res = "";
        //String email_canonical	= email;
        try {
            cnx.setAutoCommit(false);
            String query = "INSERT INTO fos_user(username,username_canonical, email,email_canonical,enabled,roles,type, password) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = cnx.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            int counter = 1;
            preparedStatement.setString(counter++, user.getUsername());
            preparedStatement.setString(counter++, user.getUsername_canonical());
            preparedStatement.setString(counter++, user.getEmail());
            preparedStatement.setString(counter++, user.getEmail_canonical());
            preparedStatement.setBoolean(counter++, user.isEnabled());
            preparedStatement.setString(counter++, user.getRoles());
            preparedStatement.setString(counter++, user.getType());
            preparedStatement.setString(counter++, user.getPassword());
            //preparedStatement.executeUpdate();

            //resultSet = preparedStatement.getGeneratedKeys();
            if (preparedStatement.executeUpdate() > 0) {
                cnx.commit();
                return res;

            }

        } catch (SQLIntegrityConstraintViolationException exception) {
            res = "Mail already exists";
        } catch (SQLException exception) {
            res = "aaaaaaaaa";
        }
            return res; 
    }

}
