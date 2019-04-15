/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondanapp;

/**
 *
 * @author Lorenco Malaj
 */
public class Campana implements Runnable{

    String suono;
    int N;
    
    /**
     * Questo è il metodo costruttore
     * @param suono è il suono che deve essere "riprodotto"
     * @param volte è il numero delle volte che il suono verrà "riprodotto"
     */
    public Campana(String suono, int volte){
        this.suono=suono;
        this.N=volte;
    }
    
    /**
     * Questo è il metodo che lancia il Thread per N volte
     */
    @Override
    public void run() {
        for(int k=0;k< N;k++){
            System.out.println((k+1)+" "+suono );
        }
    }
    
}
