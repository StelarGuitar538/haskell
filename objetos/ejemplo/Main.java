package app;

import model.Perosna;
import service.PersonaManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonaManager manager = new PersonaManager();

        //creamos e registramos personas
        manager.registrar(new Persona2("Juan", 28, true));
        manager.registrar(new Persona2("Maria", 15, true));
    }
}
