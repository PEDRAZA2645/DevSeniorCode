public class SentenciaIfElse {

    public static void main(String[] args) throws Exception {
        var edad = 17;

//        if (edad >= 18){
//            if (edad >= 60){
//                System.out.println("Usted es un Adulto mayor");
//            }
//            System.out.println("Usted es mayor de edad");
//        }else {
//            System.out.println("Usted es menor de edad");
//        }

        if (edad<= 0) System.out.println("Edad no valida");
        else if (edad > 0 || edad < 18) System.out.println("Menor de edad");
        else if (edad < 29) System.out.println("Eres un adulto joven");
        else if (edad < 45) System.out.println("Eres un adulto");
        else if (edad < 60) System.out.println("Ya estas grandecito, sal de la casa de tu papá");
        else System.out.println("Eres un adulto Mayor");

    }
}
