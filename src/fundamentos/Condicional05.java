package fundamentos;


import java.util.Scanner;


public class Condicional05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numberone = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numbertwo = sc.nextInt();

        if (numberone==numbertwo){
            System.out.println("la suma es: "+(numberone+numbertwo));

        }else if (numberone<numbertwo){
            System.out.println(Math.floor(Math.random() * (75-25+1)) + 25);
        }else if (numberone<0 && numbertwo<0){
            System.out.println("Valor absoluto: " + Math.abs(numberone));
            System.out.println("Valor absoluto: " + Math.abs(numbertwo));

        }

    }
}
