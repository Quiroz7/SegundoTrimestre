package fundamentos;

import java.util.Scanner;

public class Condicional07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número del 1 al 5: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Seleccionaste la opción 1");
                break;

            case 2:
                System.out.println("Seleccionaste la opción 2");
                break;

            case 3:
                System.out.println("Seleccionaste la opción 3");
                break;

            case 4:
                System.out.println("Seleccionaste la opción 4");
                break;

            case 5:
                System.out.println("Seleccionaste la opción 5");
                break;

            case 6:
                System.out.println("Esta opción no corresponde");
                break;

        }
    }
}