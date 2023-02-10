/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.User;

/**
 *
 * @author Renee
 */
public class AccountService {
    
    public AccountService(){
        
    }
    
    public User login(String username, String password){
        String abe = "abe";
        String barb = "barb";
        String passwords = "password";
        
        if((username.equals(abe) || username.equals(barb)) && passwords.equals(password)){
            User user = new User(username, password);
            user.setPassword(null);
            return user;
        }else{
           return null; 
        }    
    }
    
}