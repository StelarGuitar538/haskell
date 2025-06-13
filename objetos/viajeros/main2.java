package viajeros;

import java.util.List;

public class main2 {
    public static void main(String[] args) {
        GestorLista gestor = new GestorLista();

        // Agregar algunos viajeros de ejemplo
        gestor.agregarViajero(new Viajero(1, "12345678", "Ana", "Pérez", 150));
        gestor.agregarViajero(new Viajero(2, "87654321", "Luis", "García", 300));
        gestor.agregarViajero(new Viajero(3, "11223344", "María", "López", 250));

        // b) Mostrar ordenados por millas
        List<Viajero> ordenados = gestor.millasOrdenadas();
        System.out.println("Viajeros ordenados por millas:");
        ordenados.forEach(System.out::println);

        // c) Nombres con más de 200 millas
        List<String> nombres200 = gestor.mas200Millas();
        System.out.println("Nombres con más de 200 millas: " + nombres200);

        // d) Mejor viajero
        Viajero mejor = gestor.maxiViajero();
        System.out.println("Mejor viajero: " + mejor);
    }
}
