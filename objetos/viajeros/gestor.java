package viajeros;

import java.util.Objects;

public class gestor {
    private int max;             // capacidad máxima de viajeros
    private int cantidad;        // cuántos viajeros ya cargaste
    private Viajero[] viajeros; 
    
    public gestor(Integer max) {
        this.max = max;
        this.cantidad = 0;
        this.viajeros = new Viajero[max];
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void cargarViajero(Viajero viajeros) {
        if (this.cantidad <this.max) {
            this.viajeros[this.cantidad] = viajeros;
            this.cantidad += 1;
        }
    }

    public String mostrarViajero(Integer num) {
        int i = 0;
        while (i< this.cantidad && !Objects.equals(num, this.viajeros[i].getNumero())) {
            i++;
        }
        if (i < this.cantidad) {
            return this.viajeros[i].toString();
        } else {
            return "error";
        }
    }

    public int consMillas(String dni) {
        int i = 0;
        while(i < this.cantidad && !Objects.equals(dni, this.viajeros[i].getDni())) {
            i++;
        }
        if (i < this.cantidad) {
            return this.viajeros[i].getMillas()
        } else {
            throw new IllegalArgumentException("error");
        }
    }

    public void cargarMillas(String dni, int mi) {
        int i = 0;
        while(i < this.cantidad && !Objects.equals(dni, this.viajeros[i].getDni())) {
            i++;
        }
        if (i < this.cantidad) {
            this.viajeros[i].setMillas(mi);
        }
    }

    public void canjearMillas(String dni, int mi) {
    int i = 0;
    while(i < this.cantidad && !Objects.equals(dni, this.viajeros[i].getDni())) {
        i++;
        }
    if (i < this.cantidad) {
        this.viajeros[i].canjearMillas(mi);
        }
    }

    public String mejorViajero() {
        int max = 0;
        for (int i=0; i<this.cantidad; i++) {
           if(this.viajeros[i].getMillas() > max) {
            max =this.viajeros[i].getMillas();
           }
        }

        for(int i=0; i<cantidad; i++) {
            if(this.viajeros[i].getMillas() == max) {
                System.out.println(viajeros[i]);
            }
        }
}
