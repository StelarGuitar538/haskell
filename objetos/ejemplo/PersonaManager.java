package service;
import model.Persona;
import java.util.ArrayList;
import java.util.List;

public class PersonaManager {
    private final List<Persona> lista = new ArrayList<>();

    //agregar una persona a la lista
    public void registrar(Persona p) {
        lista.add(p);
    }

    //listar todas las personas
    public List<Persona> listar() {
        return new ArrayList<>(lista);
    }
}

