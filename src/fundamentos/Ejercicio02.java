package fundamentos;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Ingrese un valor numérico: ");
        int valor=sc.nextInt();
        System.out.println("valor cuadrado " + Math.pow(valor, 2));
        System.out.println("Valor Cúbico " + Math.pow(valor,3));
        System.out.println("Cuarta potencia " + Math.pow(valor,4));
    }
}
