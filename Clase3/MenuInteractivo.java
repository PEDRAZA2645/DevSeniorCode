import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {

        System.out.println("Ingrese un valor: ");
        var scanner = new Scanner(System.in);
        var text = scanner.nextLine();

        System.out.printf("El valor ingresado es: %s%n", text);
        scanner.close();

        //Boolean
        boolean active;
        //Integer numbers
        byte numberByte;
        short numberShort;
        int numberInt;
        long numberLong;
        //Float numbers
        float numberFloat;
        double numberDouble;
        //character
        char characterValue;
        var letter = 'A'; //Latin ASCII tabla de caracteres, 256 caracteres imprimibles maquina de escribir (1 byte)
        var letter2 = '\t';
        var unicodeChar = '\u0354'; //unicode (2 byte)

        //String
        String stringValue;
        var name = "Andrés";
        var lastName = "Moreno";
        var fullName = name + " " + lastName;
        System.out.println(fullName);

        var num1 = 157 / 11;
        var num2 = 157 % 11;
        System.out.printf("la division entre 157 y 11 es %d y su recidio es %d%n", num1, num2);

        var num3 = 28;
        var num4 = 17;
        var num5 = ++num3 - num4--;
        var num6 = 28;
        var num7 = 17;
        var num8 = ++num6 - --num7;
        System.out.println(num5);
        System.out.println(num8);
    }
}
