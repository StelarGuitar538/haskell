package ej2;
import java.util.List;

public class Equipo implements IDeporte {
    private String nombre;
    private List<Deportista> jugadores;

    public Equipo(String nombre, List<Deportista> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void numerar() {
        for(int i=0; i<jugadores.size(); i++){
            jugadores.get(i).setNroJugador(i+1);
        }
    }

    @Override
    public String toString(){
        return nombre + jugadores;
    }
}
