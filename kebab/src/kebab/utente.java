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
                soddisfatto = kebabbaro.sforna();
                if(soddisfatto){
                    System.out.println("Thread soddisfatto: "+ num);
                }
            }
        }
    }
    public void termina(){
        stop=true;
    }
}
