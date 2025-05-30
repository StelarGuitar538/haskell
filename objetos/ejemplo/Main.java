package app;

import model.Perosna;
import service.PersonaManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonaManager manager = new PersonaManager();

        //creamos e registramos personas
        manager.registrar(new Persona("Juan", 28, true));
        manager.registrar(new Persona("Maria", 15, true));
    }
}
