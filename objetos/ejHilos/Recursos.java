package ejHilos;

public class Recursos {
    public static void main(String[] args) throws InterruptedException{
        Thread a = new Thread(() -> {
            for(int i = 0; i<5; i++) {
                Recursos.usar();
            }
        });

        Thread b = new Thread(() -> {
            for(int i = 0; i<5; i++) {
                Recursos.usar();
            }
        });

        Thread c = new Thread(() -> {
            for(int i = 0; i<5; i++) {
                Recursos.usar();
            }
        });
        
    a.start();
    b.start();
    c.start();
    }
    public static void usar() { // sin sincronizar los hilos, se solapan entre si
        System.out.println(Thread.currentThread().getName());
    }

    public static synchronized void usar2() { // hilos sincronizados
         System.out.println(Thread.currentThread().getName());
    }
}
