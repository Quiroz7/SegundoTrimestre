package fundamentos;

import java.util.Scanner;

public class Condicional06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite cualquiera palabra: ");
        String word1 = sc.nextLine();
        System.out.println("Vuelva a digitar otra palabra: ");
        String word2 = sc.nextLine();
        int cantidad1 = word1.length();

        String total = word1.toUpperCase() + word2.toUpperCase();

        if (word1.length()>word2.length()) {
            System.out.println("La variable con más carácteres es: " + word1.toUpperCase() + " Con " + cantidad1 + " de carácteres");

        }else
            System.out.println("Las palabras digitadas fueron: " + total);
            }
        }



