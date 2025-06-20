package ej2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    public static final String SEPARADOR = ",";
	
    public static List<Deportista>leerArchivo(String nombreArchivo)throws IOException{
        BufferedReader bufferLectura = null;
        List<Deportista> datos = new ArrayList<>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombreArchivo));
            String linea;                  

            while ((linea=bufferLectura.readLine()) != null) {
             // Sepapar la linea leída con el separador definido previamente
             String[] campos = linea.split(SEPARADOR); 
             Deportista d = new Deportista(campos[0],campos[1]);
             datos.add(d);           
            }
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
         // Cierro el buffer de lectura
         if (bufferLectura != null) {
             bufferLectura.close();
         }
        }
        return datos;
    }
    /**
    * Crea los equipos con los datos pasados como parámetro
    * @param datos lista con todos los deportistas inscriptos
     * @param cantidadJugadores cantidad de jugadores que conforman un equipo
     * @return una lista de equipos
    */
    public static List<IDeporte> creaEquipos(List<Deportista> datos, int cantidadJugadores){
        List<IDeporte> equipos = new ArrayList<>();
        int contador = 1;
        if(datos.size() >= cantidadJugadores) {
             for(int i=0; i + cantidadJugadores <= datos.size(); i+= cantidadJugadores) {
            List<Deportista> grupo = datos.subList(i, i + cantidadJugadores);
            Equipo e = new Equipo("Equipo" + contador, new ArrayList<>(grupo));
            equipos.add(e);
            contador ++;
        }
        } else {
            throw new IllegalArgumentException("error");
        }
       return equipos;
    }
    /**
    Crea los equipos con los datos pasados como parámetro
     * @param datos es una lista con todos los deportitas inscriptos
     * @return una lista de Parejas formadas
    */
    public static List<IDeporte> creaParejas(List<Deportista> datos){
        List<IDeporte> parejas = new ArrayList<>();
        if(datos.size() >= 2) {
            for(int i=0; i+1 < datos.size(); i+=2) {
            Deportista[] duo = {datos.get(i), datos.get(i+1)};
            Pareja p = new Pareja(duo);
            p.numerar();
            parejas.add(p);
        }
        } else {
            throw new IllegalArgumentException("error");
        }
        return parejas;
    }
    /**
    * Numera cada integrante del equipo o de la pareja
     * @param datos 
    */
    /*  equivalencia del for
    public static void numerar(List<IDeporte> datos){
         for(int i=0; i < datos.size(); i++) {
            IDeporte d = datos.get(i);
            d.numerar();
         }
    } */

    public static void numerar(List<IDeporte> datos) {
        for(IDeporte d: datos) {
            d.numerar();
        }
    }
    /**
    * Muestra los datos de cada equipo o de cada pareja
     * @param datos
    */
    public static void mostrar(List<IDeporte> datos){
          for(IDeporte d: datos) {
            d.mostrar();
          }
    }
          
}
