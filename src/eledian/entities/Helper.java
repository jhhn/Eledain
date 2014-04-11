/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eledian.entities;

/**
 *
 * @author James
 */
public class Helper {
    private String message = "";
    
    public void setMessage(String message){
        this.message = message;
    }
    
    public void displayMessage() {
        System.out.println(message);
    }
            
}
