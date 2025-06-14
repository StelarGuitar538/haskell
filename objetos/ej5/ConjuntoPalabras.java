package ej5;

import java.util.List;
import java.util.ArrayList;

public class ConjuntoPalabras {
    private final List<Palabra> lista;

    public ConjuntoPalabras() {
        this.lista = new ArrayList<>();
    }

    public void agregar(String texto) {
        texto = texto.toLowerCase().trim();
        int i = 0;
        while(i < lista.size()) {
            Palabra p = lista.get(i);
            if(p.getPalabra().equals(texto)) {
                p.setCant(p.getCant() + 1);
                return;
            }
            i++;
        }
        lista.add(new Palabra(texto, 1));
    }

    public Palabra buscar(String texto) {
        texto = texto.toLowerCase().trim();
        int i = 0;
        while(i < lista.size()) {
            Palabra p = lista.get(i);
            if(p.getPalabra().equals(texto)) {
                return p;
            }
            i++;
        }
        return null;
    }

    public List<Palabra> getTodas() {
        return lista;
    }

}
