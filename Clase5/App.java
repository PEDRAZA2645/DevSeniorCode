import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);
        showMenu(scanner);
        System.out.println("Terminó la aplicacion");
        scanner.close();
    }
    private static void showMenu(Scanner scanner){
        int option;
        do {
            System.out.println("==============================");
            System.out.println("Menú clase 5");
            System.out.println("------------------------------");
            System.out.println("1. Prueba del ciclo while");
            System.out.println("2. Prueba do-while");
            System.out.println("3. Prueba ciclo for");
            System.out.println("0. salir de la aplicacion");
            System.out.print("Ingresa su opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();//Limpiar Buffer
            switch (option) {
                case 1:
                    whileTest();
                    break;
                case 2:
                    doWhileTest();
                    break;
                case 3:
                    forTest();
                    break;
                case 0:
                    System.out.println("Hasta Pronto");
                    break;
                default:
                    System.err.println("Ingrese una opción valida");
                    break;
            }
            if (option != 0)
                pressEnter(scanner);
        }while (option !=0);

    }

    private static void pressEnter(Scanner scanner){
        System.out.println("Press INTO for continue");
        scanner.nextLine();
    }
    public static void forTest(){
        for (int i = 0; i < 10 ; i+=3) {
            System.out.println(--i);
        }
        System.out.println("You Win!");
    }
    public static void doWhileTest(){
        var counter = 0;
        do {
            System.out.println(counter);
        } while (counter > 0);
        System.out.println("Boom!");
    }
    public static void whileTest(){
        var counter = 1;
        while (counter <= 10){
            System.out.println(counter);
            counter++;
        }
    }
}
