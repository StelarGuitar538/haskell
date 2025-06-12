package ej2;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int cantidadJugadoresFutbol= 5;                  
    
        List<Deportista> datosFutbol= leerArchivo("C:/Users/danie/OneDrive/Documentos/GitHub/haskell/objetos/ej2/archivosCSV/inscriptosFutbol.csv");
        List<Deportista> datosPinPon= leerArchivo("C:/Users/danie/OneDrive/Documentos/GitHub/haskell/objetos/ej2/archivosCSV/inscriptosPinPon.csv");
    } 
}
