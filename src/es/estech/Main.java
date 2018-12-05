package es.estech;

import java.util.Scanner;

public class Main {

    public static boolean esCapicua (String numero) {

        boolean result = false;

        if (numero.length() == 2){
            if (numero.charAt(0)==numero.charAt(1)){
                result = true;
            }
        }

        if (numero.length() == 3){
            if (numero.charAt(0)==numero.charAt(1)){
                result = true;
            }
        }

        return result;
    }

    public static boolean esPar (String numero){
        int n = Integer.parseInt(numero);
        if (n%2==0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean esDivisiblePorTres (String numero){
        int n = Integer.parseInt(numero);
        if (n%3==0){
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir un número entero");
        String numero = sc.next();
        if (numero.length() == 2 || numero.length() == 3){
            if (esCapicua(numero)){
                System.out.println("Es capicúa");
            }else{
                System.out.println("No es capicúa");
            }
        }
        if (numero.length()>=3){
            if (esPar(numero));
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }

        if (numero.length()==1){
            if (esDivisiblePorTres(numero)){
                System.out.println("Es divisible entre tres");

            }else{
                System.out.println("No es divisible entre tres");
            }

        }

	
    }
}
