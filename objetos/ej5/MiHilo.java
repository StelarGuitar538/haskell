package ej5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MiHilo  extends Thread{
    private final String rutaArchivo;
    private final ConjuntoPalabras conjunto;

    public MiHilo(String rutaArchivo, ConjuntoPalabras conjunto) {
        this.rutaArchivo = rutaArchivo;
        this.conjunto = conjunto;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            while ((linea = br.readLine()) != null) {
                //normalizar minusculas y quitars signos
                String[] palabras = linea
                    .toLowerCase()
                    .replaceAll("[^a-záéíóúñü\\s]", "")
                    .split("\\s+");
                for(String palabra : palabras) {
                    if(!palabra.isBlank()) {
                        conjunto.agregar(palabra);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("error" + rutaArchivo);
        }
    }
}
