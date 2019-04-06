/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Login;

import Entities.User;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import Tools.AlertHelper;
import javafx.event.ActionEvent;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author asus
 */
public class LoginFXMLController implements Initializable {
     @FXML
    private TextField loginEmailText;
    @FXML
    private PasswordField loginPasswordText;
    @FXML
    private Button login;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    private void handleExit(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void login(ActionEvent event) {
        Window owner = login.getScene().getWindow();
        if(loginEmailText.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your email");
            return;
        }
        if(loginPasswordText.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your password");
            return;
        }
        
//        result.setText(authenticationService.login(emailText.getText(), passwordText.getText()));
        /*if (authenticationService.login(emailText.getText(), passwordText.getText()))
        {
            AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!", 
                "Welcome ");
        }
        else{
            AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Error!", 
                "Verify Credentials ");
        }*/
    }

    @FXML
    private void handleLoginClicked(MouseEvent event) {

        String username_text = loginEmailText.getText();
        String password_text = loginPasswordText.getText();
        Window owner = login.getScene().getWindow();

        if (username_text.isEmpty() || password_text.isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.WARNING, owner, null, "Veuillez bien renseigner votre email et/ou mot de passe");
            loginEmailText.requestFocus();
        } else {
            u = us.getUserByUsername(username_text);
            if (username_text.contains("@")) {
                u = us.getUserByEmail(username_text);
            }

            if (u != null) {
                if (BCrypt.checkpw(password_text, u.getMdp().replace("$2y$", "$2a$"))) {

                    if (u.getEtat() == EtatUser.Active || u.getEtat() == EtatUser.Disconnected || u.getEtat() == EtatUser.Connected) {

                        Utils.showTrayNotification(NotificationType.NOTICE, "Connexion établie", u.getType().toString(), "Bienvenue " + u.getNom() + " "
                                + u.getPrenom(),u.getPhoto(), 5000);

                        //us.modifierEtatUser(u.getId(), EtatUser.Connected);
                        AccueilController.userConnected = u;
                        ac.setAccueil();

                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.close();

                    else {
                            Alert alert = Utils.getAlert(Alert.AlertType.CONFIRMATION, "Bienvenue", null, "Entrez le code de validation envoyé à votre mail :"
                                    + "\n" + u.getEmail().substring(0, 5) + "***" + u.getEmail().substring(u.getEmail().indexOf("@"), u.getEmail().indexOf("@") + 5) + "***");
                            JFXTextField tf_code = new JFXTextField();
                            tf_code.setPromptText("######");
                            alert.setGraphic(tf_code);
                            tf_code.requestFocus();
                            alert.show();
                            alert.resultProperty().addListener((observable, oldValue, newValue) -> {
                                if (newValue == ButtonType.OK) {
                                    if (u.getToken().equals(tf_code.getText().trim())) {
                                        us.modifierEtatUser(u.getId(), EtatUser.Active);
                                        Utils.showTrayNotification(NotificationType.NOTICE, "Vous êtes confirmé", u.getType().toString(), "Veuillez-vous connecter",
                                                u.getPhoto(), 5000);
                                    }
                                }
                            });
                        }
                 
                            
                    }
                } else {
                    AlertHelper.showAlert(Alert.AlertType.ERROR,owner, null, "Username et/ou mot de passe invalide(s)");
                    loginEmailText.requestFocus();
                }
            } else {
                AlertHelper.showAlert(Alert.AlertType.ERROR,owner, null, "Username et/ou mot de passe invalide(s)");
                loginEmailText.requestFocus();
            }
        }
    }

    @FXML
    private void changerMdpClicked(MouseEvent event) {
        String usr = username.getText();

        if (usr.equals("")) {
            Utils.showAlert(Alert.AlertType.WARNING, "Champ vide", null, "Veuillez bien renseigner votre nom d'utilisateur ou email");
            loginEmailText.requestFocus();
        } else {
            User u;
            if (usr.contains("@")) {
                u = us.getUserByEmail(usr);
            } else {
                u = us.getUserByUsername(usr);
            }
            if (u != null) {
                String code = Utils.generateCode(6);
                Utils.sendMail(u.getEmail(), code);
                ChangerMdpController.set(code, u, blur);
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ChangerMdp.fxml"));
                Stage stage = Utils.getAnotherStage(loader, "Changer mot de passe");
                stage.initStyle(StageStyle.TRANSPARENT);
                stage.show();

            } else {
                Alert alert = AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "Erreur de récupération", null,
                        "Username ou mail n'existe pas dans notre base de données \nVoulez-vous faire une inscription ?");
                alert.show();
                alert.resultProperty().addListener(new ChangeListener<ButtonType>() {
                    @Override
                    public void changed(ObservableValue<? extends ButtonType> observable, ButtonType oldValue, ButtonType newValue) {
                        if (newValue == ButtonType.OK) {
                            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inscription.fxml"));
                            Utils.getAnotherStage(loader, "Inscription").show();
                        }
                    }
                });

                username.requestFocus();
            }
        }
    }

    @FXML
    private void createUserClicked(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Inscription.fxml"));
        Utils.getAnotherStage(loader, "Inscription").show();
    
}
