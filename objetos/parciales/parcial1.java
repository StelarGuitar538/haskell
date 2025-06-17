package parciales;

import java.util.List;
import java.util.ArrayList;

public class parcial1 {
    List<Automotor> auto;
    List<Inmueble> inuemble;

    public parcial1() {
        this.auto = new ArrayList<>();
        this.inuemble = new ArrayList<>();
    }

    public void agregarInmueble(Inmueble inmuebles){
        inmueble.add(inmuebles)
    }
    
    public void agregarAuto(Automotor autos){
        auto.add(autos);
    }
    
    public void exceptuados() {
        for(Automotor autos: auto) {
            agregarAuto(autos.getPat());
        }

        for(Inmueble inm : inuemble) {
            agregarInmueble(inm.getNroCat());
        }
    }

    public int totalAutos(){
        int i = 0;
        int c = 0;
        while (i < auto.size() ) {
            if(auto.get(i).getPat() == 2023){
                c++;
            }
            i++;
        }
        return c;
    }


    public int totalAutos2(){
        int c = 0;
       for(Aumotor a: auto){
        if(a.getPat() == 2023) {
            c++;
        }
       }
       return c;
    }



    public int megaInmueble() {
        int c = 0;
        for(Inmueble inm:inmueble) {
            if(inm.impuesto() > 100000) {
                c++;
            }
        }
        return c;
    }

}
