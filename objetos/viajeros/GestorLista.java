package viajeros;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GestorLista {
    private final List<Viajero> viajeros;

    public GestorLista() {
        this.viajeros = new ArrayList<>();
    }

    public void agregarViajero(Viajero v) {
        viajeros.add(v);
    }

    public List<Viajero> millasOrdenadas() {
        return viajeros.stream()
        .sorted(Comparator.comparingInt(Viajero::getMillas))
        .collect(Collectors.toList());
    }

    public List<String> mas200Millas() {
        return viajeros.stream()
        .filter(v -> v.getMillas() > 200)
        .map(Viajero::getNombre)
        .collect(Collectors.toList());
    }

    public Viajero maxiViajero() {
        return viajeros.stream()
        .max(Comparator.comparingInt(Viajero::getMillas))
        .orElseThrow(() -> new IllegalArgumentException("error"));
    }
}
