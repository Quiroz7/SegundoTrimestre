package fundamentos;

import java.util.Scanner;

public class Ejerciocio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor para pulgadas: ");
        double valor_p = sc.nextDouble();
        double convertidor = valor_p*0.0254;
        System.out.println(valor_p + " pulgadas,son "+ convertidor+ "metros");
    }
}
