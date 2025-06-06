package viajeros;

public class Viajero {
    private int numero;
    private String dni;
    private String nombre;
    private String apellido;
    private int millas;

    public Viajero(int numero, String dni, String nombre, String apellido, int millas) {
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.millas = millas;
    }

    public int getNumero() {
        return numero;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMillas() {
        return millas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMillas(int millas) {
        this.millas = millas;
    }

    public int acumularMillas(int millas) {
        this.millas += millas;
        return millas;
    }

    public int canjearMillas(int millas) {
        if (millas <= this.millas) {
            this.millas -= millas;
        } else {
            throw new IllegalArgumentException("error");
        }
        return millas;
    }

    @Override

    public String toString() {
        return "Viajero{" +
                "numero=" + numero +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", millas=" + millas +    '}';
    }
}


