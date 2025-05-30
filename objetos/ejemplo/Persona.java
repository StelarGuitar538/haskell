package model;

public class Persona {
    // campos privados (encapsulacion)
    private String nombre;
    private int edad;
    private boolean vivo;

    //constructor
    public Persona(String nombre, int edad, boolean vivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.vivo = vivo;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("la edad no puede ser negativa");
        }
    }

    public boolean getVIvo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    // to string(), impresion de datos
    @Override
    public String toString() {
        return nombre + edad + vivo;
    }


}