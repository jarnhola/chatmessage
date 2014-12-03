/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package message;

/**
 *
 * @author Opiframe
 */
public class RegisterUser {
    
    private String userName;
    /**
     * Returns the user name of chat client
     * @return String representing the username
     */
    public String getUserName() {
        return userName;
    }
   
    /**
     * Sets the username of chat client. Has to be at least 1 character wide.
     * Otherwise throws 
     * @param userName 
     */
    public void setUserName(String userName) {
        
        if(!userName.isEmpty()){
            this.userName = userName;
        }
    }
    
}
