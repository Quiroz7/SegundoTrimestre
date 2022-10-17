package fundamentos;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();
        double promedio = (numero1+numero2)/2;

        System.out.println("la suma es: "+ (numero1+numero2));
        System.out.println("La diferencia es: "+ (numero1-numero2));
        System.out.println("El producto es: "+ (numero1*numero2));
        System.out.println("El promedio es: "+ (promedio));
        System.out.println("Máximo Valor: "+ Math.max(numero1,numero2));
        System.out.println("Mínimo Valor: "+ Math.min(numero1,numero2));

    }
}
