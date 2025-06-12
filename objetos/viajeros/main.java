package viajeros;

import java.util.Scanner;

public class main {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese capacidad máxima de viajeros: ");
        int capacidad = sc.nextInt();
        sc.nextLine();  // limpiar el salto de línea
        gestor gestorV = new gestor(capacidad);

        int opcion;
        do {
            System.out.println("\n--- Menú de Gestión de Viajeros ---");
            System.out.println("1. Cargar nuevo viajero");
            System.out.println("2. Mostrar viajero por número");
            System.out.println("3. Consultar millas por DNI");
            System.out.println("4. Acumular millas a un viajero");
            System.out.println("5. Canjear millas de un viajero");
            System.out.println("6. Mostrar mejor viajero (más millas)");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // consumir salto

            switch (opcion) {
                case 1:
                    System.out.print("Número de viajero: ");
                    int num = sc.nextInt(); sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Apellido: ");
                    String ape = sc.nextLine();
                    System.out.print("Millas iniciales: ");
                    int millas = sc.nextInt(); sc.nextLine();
                    gestorV.cargarViajero(new Viajero(num, dni, nom, ape, millas));
                    break;
                case 2:
                    System.out.print("Número a buscar: ");
                    int nb = sc.nextInt(); sc.nextLine();
                    System.out.println(gestorV.mostrarViajero(nb));
                    break;
                case 3:
                    System.out.print("DNI a consultar: ");
                    String dc = sc.nextLine();
                    try {
                        System.out.println("Millas: " + gestorV.consMillas(dc));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("DNI a acumular: ");
                    String da = sc.nextLine();
                    System.out.print("Millas a acumular: ");
                    int ma = sc.nextInt(); sc.nextLine();
                    gestorV.cargarMillas(da, ma);
                    break;
                case 5:
                    System.out.print("DNI a canjear: ");
                    String dcan = sc.nextLine();
                    System.out.print("Millas a canjear: ");
                    int mcan = sc.nextInt(); sc.nextLine();
                    gestorV.canjearMillas(dcan, mcan);
                    break;
                case 6:
                    gestorV.mejorViajero();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);

        sc.close();
    }
}
