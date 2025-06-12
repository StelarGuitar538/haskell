package ej2;

public class Deportista {
    private String nombre;
    private String dni;
    private Integer nroJugador;

    public Deportista(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getNroJugador() {
        return nroJugador;
    }

    public void setNroJugador(Integer nroJugador) {
        this.nroJugador = nroJugador;
    }

    @Override
    public String toString() {
        return dni + nombre;
    }
}
