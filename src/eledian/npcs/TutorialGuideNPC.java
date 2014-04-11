/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eledian.npcs;

import eledian.entities.Helper;

/**
 *
 * @author James
 */
public class TutorialGuideNPC extends Helper {
    public TutorialGuideNPC(){
        Helper h = new Helper();
        h.setMessage(""); // set your message
        h.displayMessage();
    }
}
