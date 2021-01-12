/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebab;

/**
 *
 * @author porretta.christian
 */
public class Kebab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread [] t = new Thread [20];
        kebabbaro k = new kebabbaro();
        for(int i=0;i<20;i++){
            t [i] = new Thread(new utente(k,i));
        }
        for(int i=0;i<20;i++){
            t [i].start();
        }
    }

}
