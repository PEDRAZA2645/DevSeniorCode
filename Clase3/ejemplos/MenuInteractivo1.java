package ejemplos;

import java.util.Scanner;

/**
 * Este programa muestra un menú interactivo que permite al usuario seleccionar una opción hasta que decida salir.
 */
public class MenuInteractivo1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la Opción 1");
                    break;
                case 2:
                    System.out.println("Has elegido la Opción 2");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
        scanner.close();
    }
}
