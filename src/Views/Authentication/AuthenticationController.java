/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Authentication;

import Entities.User;
import Services.Implementation.AuthenticationService;
import Tools.AlertHelper;
import com.jfoenix.controls.JFXRadioButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;


/**
 * FXML Controller class
 *
 * @author asus
 */
public class AuthenticationController implements Initializable {

   
    
    @FXML
    private TextField emailText;
    @FXML
    private PasswordField passwordText;
    
    
    @FXML
    private Button signupBtn;
    
    AuthenticationService authenticationService = AuthenticationService.getInstance();
    @FXML
    private TextField usernameText;
    @FXML
    private JFXRadioButton employerType;
    @FXML
    private JFXRadioButton freelancerType;
        @FXML
    private ToggleGroup accountType;
    
    String account = ((RadioButton) this.accountType.getSelectedToggle()).getText();



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
     @FXML
    private void signup(ActionEvent event) {
        Window owner = signupBtn.getScene().getWindow();
        if(emailText.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your email");
            return;
        }
       
       if(passwordText.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your password");
            return;
        }
       
        if(freelancerType.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your password");
            return;
        }
        
        if(usernameText.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter your password");
            return;
        }
        String accountType = "";
        
            if (employerType.isSelected())
            {
                accountType += "employer";
            }
            else if (freelancerType.isSelected())
            {
                accountType += "freelancer";
            }
            User user = new User(emailText.getText(),accountType, usernameText.getText(), passwordText.getText());
            String msg = authenticationService.register(user);
            if (msg.isEmpty())
        {
            AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!", 
                "Welcome ");
        }
        else{
            AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Error!", 
                msg);
        }
        }
        

    }
    

