package ej5;

public class Palabra {
    private String palabra;
    private int cant;

    public Palabra(String palabra, int cant) {
        this.palabra = palabra;
        this.cant = cant;
    }

    public String getPalabra(){
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

      @Override
    public String toString(){
        return palabra + cant;
    }
}
