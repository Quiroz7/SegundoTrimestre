package fundamentos;


import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        String word = sc.nextLine();
        System.out.println("Ingrese letra a confirmar: ");
        String letra = sc.next();
        System.out.println("La frase: "+ word + " contiene la letra " + letra + "??");
        System.out.println(word.contains(letra));

    }
}
