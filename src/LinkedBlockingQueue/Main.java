/*
 * Implemente duas versões do problema do produtor/consumidor com M produtores 
 * e N consumidores usando ArrayBlockingQueue e LinkedBlockingQueue. Compare o
 * desempenho das duas implementações.
 */
package LinkedBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) {
//        BlockingQueue fila = new ArrayBlockingQueue(100);
        BlockingQueue fila = new LinkedBlockingQueue(100);

        Produtor p1 = new Produtor(fila);
        Produtor p2 = new Produtor(fila);
        Produtor p3 = new Produtor(fila);
        Consumidor c1 = new Consumidor(fila);
        Consumidor c2 = new Consumidor(fila);
        Consumidor c3 = new Consumidor(fila);

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();

    }
}
