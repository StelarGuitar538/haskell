package ej2;

public class Pareja implements IDeporte {
    private Deportista[] depoArre;

    public Pareja(Deportista[] depoArre) {
         this.depoArre = depoArre;
    }

    public Deportista[] getArre() {
        return depoArre;
    }

    @Override
    public void mostrar() {
        for(int i = 0; i < depoArre.length; i++) {
            Deportista d = depoArre[i];
            System.out.println(d.getNroJugador() + d.getNombre() + d.getDni());
        }
    }

    @Override
    public void numerar() {
        depoArre[0].setNroJugador(1);
        depoArre[1].setNroJugador(2);
    }
}
