/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author rafael
 */
public class Consumidor implements Runnable {

    private final BlockingQueue fila;

    public Consumidor(BlockingQueue fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 3000000) {
            try {
//                System.out.println("Pegando valor da fila: " + this.fila.take());
                this.fila.take();
            } catch (InterruptedException ex) {
            }
            count++;
        }
    }

}
