/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebab;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author porretta.christian
 */
public class kebabbaro extends Thread {
    
    private panino kebab;

    public kebabbaro(panino kebab) {
        this.kebab = kebab;
    }
    
    public void run(){
        prepara();
        kebab.paninoPronto();
    }
    public void prepara(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {}
    }
}
