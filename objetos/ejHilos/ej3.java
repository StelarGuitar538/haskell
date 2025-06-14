package ejHilos;

import java.util.ArrayList;
import java.util.List;

public class ej3 {
    private static final List<Integer> buffer = new ArrayList<>();
    private static final int Capacidad = 10;
    public static void main(String[] args) {
        Thread productor = new Thread(()-> {
            try {
                for(int i = 1; i<=100;i++){
                    producir(i);
                    Thread.sleep(50);
                } catch(InterruptedException e) {
                    Thread.currentThread.interrupt();
                }
            }
        }, "Productor");

        Thread consumidor = new Thread(() -> {
            try {
                for(int i = 0; i<=100; i++) {
                    consumir();
                    Thread.sleep(100);
                } catch(InterruptedException e) {
                    Thread.currentThread.interrupt();
                }
            }
        }, "consumidor");

        productor.start();
        consumidor.start();
    }

    private static void producir(int valor) throws InterruptedException{
        synchronized(buffer) {
            while (buffer.size() == Capacidad) {
                buffer.wait();
            }
            buffer.add(valor);
            System.out.println("producido: " + valor);
            buffer.notifyAll(); // avisamos a consumidores
        }
    }

    private static void consumir() throws InterruptedException {
        int valor;
        synchronized(buffer) {
            while (buffer.size() == Capacidad) {
                buffer.wait();
            }
            valor = buffer.remove(0);
            buffer.notifyAll(); // avisamos a productores
        }
        System.out.println("Consumido" + valor);
    }
}
