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
public class panino {
    private boolean panino;
    public synchronized boolean prendiPanino(){
        if(panino){
            panino = false;
            return true;
        }
        return false;
    }
    public synchronized boolean paninoPronto(){
        panino = true;
    }
}
