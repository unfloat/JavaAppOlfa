/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import javafx.beans.property.BooleanProperty;

/**
 *
 * @author asus
 */
public class User {
    private int id;
    private String email;
    private String email_canonical;
    private String roles = "";
    private String firstName;
    private String lastName;
    private String type;
    private String username;
    private String username_canonical;
    private boolean enabled;
    

    public User(String email, String type, String username, String password) {
        this.email = email;
        this.type = type;
        this.username = username;
        this.password = password;
        this.username_canonical = username.toLowerCase();
        this.email_canonical = email.toLowerCase();
        this.enabled = true;
        if (this.type.equalsIgnoreCase("freelancer"))
        {
            roles += "freelancer";
        }
        else
        {
            roles+= "employer" ;
        }

        
    }

    public User(String text, BooleanProperty type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getUsername_canonical() {
        return username_canonical;
    }

    public void setUsername_canonical(String username_canonical) {
        this.username_canonical = username_canonical;
    }
    
    
    

    public String getEmail_canonical() {
        return email_canonical;
    }

    public void setEmail_canonical(String email_canonical) {
        this.email_canonical = email_canonical;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
   
    
    

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
    

}
