/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Interface;

import Entities.User;

/**
 *
 * @author asus
 */
public interface AuthenticationServiceInterface {
    public abstract String register(User user);
    public abstract String login(String email, String username);
    
}
