package fundamentos;

import java.util.Scanner;

public class Condicional02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número: ");
        int number1 = sc.nextInt();
        System.out.println("Digite el segundo número: ");
        int number2 = sc.nextInt();
        System.out.println("Digite el tercer número: ");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3){
            System.out.println("El número: "+ number1 + " Es mayor");
        }else if (number2 > number3 && number2 > number1) {
            System.out.println("el número: " + number2 + " es el mayor");
        }else{
            System.out.println("el número: "+ number3+ " es el mayor");
        }

    }
}
