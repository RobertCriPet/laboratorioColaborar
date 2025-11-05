import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);



    public static int validaInt(){
        int numero;

        while (!sc.hasNextInt()) {
            System.out.println("Eso no es un número!");
            sc.next(); // IMPORTANTE!
        }
        return numero = sc.nextInt();
    }

    public static double validaDouble(){
        double numero;

        while (!sc.hasNextDouble()) {
            System.out.println("Eso no es un número!");
            sc.next(); // IMPORTANTE!
        }
        return numero = sc.nextDouble();
    }

    public static String cadena(){
        String texto;
        return texto = sc.nextLine();
    }
}
