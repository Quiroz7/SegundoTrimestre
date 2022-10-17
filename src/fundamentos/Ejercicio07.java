package fundamentos;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese texto: ");
        String texto = sc.nextLine();
        System.out.println("La cantidad de carácteres del texto: "+ texto+ " son de: "+ texto.length());
    }
}
