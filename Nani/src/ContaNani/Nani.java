/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaNani;

/**
 * Thread che stampa 7 numeri in sequenza.
 * @author Lorenco Malaj
 */
public class Nani extends Thread {
    /**
     * Costruttore.
     * @param n  imposta il nome del thread
     */
    public Nani(String n){
        super();
        setName(n);
    }
    
    /**
     * Questo metodo che lancia il thread . Stampa un numero da 1 a 7.
     */
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 7 ; i++){
            System.out.println((i+1) + " " + getName());
        }
    }
}
