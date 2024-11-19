import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
//        Imprimir datos en pantalla
//        System.out.println("Hola Mundo!");
        System.out.println("Hola Andres!");//con salto de linea
        System.out.print("¿como va todo?\n");// sin salto de linea
        System.out.printf("Aqui va una cadena: %s\n", "Andres");//imprime cadenas cadenas
        System.out.printf("Mi nombre es: %s, y tengo %d años", "Andres", 29);

        var entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: " );
        var entero = entrada.nextInt();
        System.out.printf("El numero es: %d", entero);

        entrada.close();


    }
}
