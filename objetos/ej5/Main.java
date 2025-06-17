package ej5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConjuntoPalabras conjunto = new ConjuntoPalabras();

        String archivo1 = "texto.txt";
        String archivo2 = "texto2.txt";

        MiHilo hilo1 = new MiHilo(archivo1,conjunto);
        MiHilo hilo2 = new MiHilo(archivo2,conjunto);
        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();
        
        for(palabra p:conjunto.getTodas()) {
            System.out.println(p.getPalabra() + p.getCant());
        }


    }
}
