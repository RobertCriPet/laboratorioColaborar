import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);
    }

    private static void menu(Scanner sc) {
        int valor;
        do {
            System.out.println(""" 
                        Elige dentro del sigiente listado el ejercicio que quieres coompilar:
                        1:Ejercicio 1
                        2:Ejercicio 2
                        3:Ejercicio 3
                        4:Ejercicio 4
                        5:Ejercicio 5
                        6: Salir del programa
                    """);
            valor= Utils.validaInt();
            Utils.sc.nextLine();
            switch (valor) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> System.out.println("Hasta luego!");
                default -> System.out.println("Opcion no permitida");
            }
        } while (valor != 6);
    }

    private static void ejercicio1(){
        System.out.println("dime un texto");
        String texto = Utils.cadena();
        String array[] = new String[texto.length()];
        for (int i = 0; i < array.length; i++) {
            array[i]= String.valueOf(texto.charAt(i));
            System.out.println(array[i]);
        }
    }

    private static void ejercicio2(){
        System.out.println("dime un texto");
        String texto1 = Utils.cadena();
        System.out.println("dime otro texto");
        String texto2 = Utils.cadena();
        if(texto1.equals(texto2)){
            System.out.println("las cadenas son iguales");
        }else if(texto1.equalsIgnoreCase(texto2)){
            System.out.println("las cadenas son iguales sin case sensitive");
        } else{
            System.out.println("no son iguales");
        }
    }

    private static void ejercicio3(){
        System.out.println("dime un texto");
        String texto1 = Utils.cadena();
        System.out.println("dime otro texto");
        String texto2 = Utils.cadena();
        System.out.println("dime un texto");
        String texto3 = Utils.cadena();
        if(texto1.length()<=3 && texto2.length()<=3 && texto3.length()<=3){
            System.out.println(texto1.substring(0,3) + texto2.substring(0,3) + texto3.substring(0,3));
        }else{
            System.out.println("algunas de las palabras son menos de 3 caracteres");
        }


    }

    private static void ejercicio4() {
        String sdfsfssfwkrebnr = obtenerTexto();
        Map<Character, Integer> contadorVocales = contarVocales(sdfsfssfwkrebnr);
        mostrarResultados(contadorVocales);
    }

    private static String obtenerTexto() {
        System.out.println("Dime un texto:");
        return Utils.cadena().toLowerCase();
    }

    private static Map<Character, Integer> contarVocales(String texto) {
        Map<Character, Integer> contador = new LinkedHashMap<>();
        String vocales = "aeiou";

        // Inicializar contadores
        for (char vocal : vocales.toCharArray()) {
            contador.put(vocal, 0);
        }

        // Contar caca
        for (char letra : texto.toCharArray()) {
            if (contador.containsKey(letra)) {
                contador.put(letra, contador.get(letra) + 1);
            }
        }

        return contador;
    }

    private static void mostrarResultados(Map<Character, Integer> contadorVocales) {
        for (Map.Entry<Character, Integer> entrada : contadorVocales.entrySet()) {
            char vocal = Character.toUpperCase(entrada.getKey());
            int cantidad = entrada.getValue();
            System.out.printf("Nº de %c's: %d%n", vocal, cantidad);
        }
    }


    private static void ejercicio5(){
        System.out.println("dime un texto");
        String texto = Utils.cadena().toLowerCase();
        String textoLimpio= texto.replaceAll(" ", "");
        String textoInvertido = new StringBuilder(textoLimpio).reverse().toString();
        if(textoLimpio.equals(textoInvertido)){
            System.out.println("el texto es palindromo");
        }else{
            System.out.println("no es palindromo");
        }
        System.out.println("TODO ESTÁ MALLL");
    }
}