/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnd.controllers;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import Entities.FosUser;
import Services.Implementation.AuthenticationService;
import mnd.utils.BCrypt;

/**
 * FXML Controller class
 *
 * @author Camilia
 */
public class AuthentificationController implements Initializable {

    //    @FXML
//    private Label userStatus;
//    @FXML
//    private Label mdpStatus;
    @FXML
    private TextField nom;
    @FXML
    private PasswordField pwd;
    public static AuthentificationController authentificationController;
    private User user;
      
//    }
    @FXML
    private HBox upbox;
    @FXML
    private Label userStatus;
    @FXML
    private JFXTextField codeL;

    public AuthentificationController() {
        authentificationController = this;
    }

    public static AuthentificationController getInstance() {
        return authentificationController;
    }

    public User getUser() {
        return user;
    }
    @FXML
    private Button log;
    int nb;

    @FXML
    private void login(ActionEvent event) throws Exception {
        nb++;
        System.out.println(nb);
        UserService us = new UserService();
//            user = new User();
        String username = nom.getText();
        String password = pwd.getText();
        String code = codeL.getText();
        String code2 = "1234";
        int x = SmsService.x;
        User u = us.findUserByUsername(username);
//                currentUser = u;
        SmsService sms = new SmsService();
        user = u;

        if (u != null) {

            if (u.getEnabled() == true) {

                StringBuilder finalpassword = new StringBuilder(u.getPassword());
                finalpassword.setCharAt(2, 'a');
                String pass = finalpassword.toString();
                if (BCrypt.checkpw(password, pass)) {
                    if (nb == 1) {
                     sms.sendSms(x);
                    }
                    System.out.println(x);

                    if (code.equals(Integer.toString(x))) {
                        Stage stage = (Stage) log.getScene().getWindow();
                        if (u.getRoles().equals("user")) {
                            Parent root = FXMLLoader.load(getClass().getResource("/mnd/gui/Ui.fxml"));
                            nb=0;
                            stage.close();
                            stage = new Stage();
                            Scene scene = new Scene(root);
                            scene.setFill(Color.TRANSPARENT);
                            stage.setScene(scene);
                            stage.initStyle(StageStyle.TRANSPARENT);
                            stage.show();
                        } else {
                            Parent root = FXMLLoader.load(getClass().getResource("/mnd/gui/AdminUi.fxml"));
                            nb=0;
                            stage.close();
                            stage = new Stage();
                            Scene scene = new Scene(root);
                            scene.setFill(Color.TRANSPARENT);
                            stage.setScene(scene);
                            stage.initStyle(StageStyle.TRANSPARENT);
                            stage.show();
                        }
                    } else {
                        System.out.println("false code");
                    }
                } else {
//                mdpStatus.setText("mot de passe éronné");
                    pwd.setStyle("-fx-border-color:red;-fx-background-color:transparant;-fx-border-width:0px0px2px0px;-fx-font-size:1.4em");
                }
            } else {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Warning Dialog");
                alert.setHeaderText(null);
                alert.setContentText("vous etes bannis");

                alert.showAndWait();
            }
        } else {
//            userStatus.setText("utilisateur n'existe pas");
            nom.setStyle("-fx-border-color:red;-fx-background-color:transparant;-fx-border-width:0px0px2px0px;-fx-font-size:1.4em");
        }

    }

    @FXML
    public void registerUser(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/mnd/gui/FXML.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nb = 0;
        SmsService.x = (int) ((Math.random() * ((9999 - 999) + 1)) + 999);
        System.out.print(SmsService.x);

    }

}
