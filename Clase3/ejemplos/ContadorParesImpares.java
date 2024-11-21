package ejemplos;

/**
 * Este programa cuenta cuántos números pares e impares hay entre el 1 y el 20.
 * Adicionalmente, imprime cada uno de los números pares que hay en el rango.
 */
public class ContadorParesImpares {
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;
55
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
                continue;
            }
            System.out.println("Número par: " + i);
        }

        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números impares: " + impares);
    }
}