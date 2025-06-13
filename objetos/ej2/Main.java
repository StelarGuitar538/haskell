package ej2;

import ej2.Deportista;
import ej2.IDeporte;
import ej2.Campeonato;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int cantidadJugadoresFutbol= 5;                  
    
        List<Deportista> datosFutbol= Campeonato.leerArchivo("C:/Users/danie/OneDrive/Documentos/GitHub/haskell/objetos/ej2/archivosCSV/inscriptosFutbol.csv");
        List<Deportista> datosPinPon= Campeonato.leerArchivo("C:/Users/danie/OneDrive/Documentos/GitHub/haskell/objetos/ej2/archivosCSV/inscriptosPinPon.csv");

        List<IDeporte> equipos = Campeonato.creaEquipos(datosFutbol, cantidadJugadoresFutbol);
        List<IDeporte> parejas = Campeonato.creaParejas(datosPinPon);

        Campeonato.numerar(equipos);
        Campeonato.numerar(parejas);

        Campeonato.mostrar(equipos);
        Campeonato.mostrar(parejas);
    } 
}
