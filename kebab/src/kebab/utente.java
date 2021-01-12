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
public class utente implements Runnable{
    
    private boolean soddisfatto = false;
    private kebabbaro kebabbaro;
    private boolean stop = false;
    int num;

    public utente(kebabbaro kebabbaro, int num) {
        this.kebabbaro = kebabbaro;
        this.num = num;
    }

    @Override
    public void run(){
        while(!stop){
            while(!soddisfatto){
                soddisfatto = kebab.prendiPanino();
                if(soddisfatto){
                    System.out.println("Thread soddisfatto: "+ num);
                    notifyAll();
                }else{
                    try {
                        wait();
                    } catch (InterruptedException ex) {}
                }
            }
        }
    }
    public void termina(){
        stop=true;
    }
}
