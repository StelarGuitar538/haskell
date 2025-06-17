package parciales;

import java.util.List;
import java.util.ArrayList;


public class parcial2 {
    List<Biblioteca> biblio;

    public parcial2() {
        this.biblio = new ArrayList<>();
    }

    public void agregar(Biblioteca biblio) {
        bib.add(biblio);
    }

    public void morosos() {
        for(Biblioteca bib : biblio) {
            if(bib.getEstado().equals("Deudor")) {
                agregar(bib.getNom());
            }
        }
    }

    public int totalSocios() {
        return biblio.size();
    }

    public void exceptuados(){
        for(Biblioteca bib: biblio) {
            if(bib.cuota() == 0) {
                System.out.println(bib);
            }
        }
    }

    public void exceptuados2() {
        for(Biblioteca bib: biblio) {
            if(bib.cuota() == 0) {
                String nombre = bib.getNom();
                if(bib instanceof Alumno) {
                    Alumno a = (Alumno) bib;
                    System.out.println(nombre + a.getRegistro());
                } else {
                    Agente ag = (Agente) bib;
                    System.out.println(nombre + ag.getCuil());
                }
            }
        }
    }
}
