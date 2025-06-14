package ejHilos;

public class Hilo {
    public static void main(String[] args) {
        // Hilo 'ping'
        Thread a = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("ping");
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Hilo 'pong'
        Thread b = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("pong");
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Iniciar ambos hilos
        a.start();
        b.start();

        // Esperar a que finalicen
        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}