package fundamentos;

import java.util.Scanner;

public class Condicional03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese temperatura en Grados Centígrados: ");
        float grades = sc.nextFloat();

        if (grades<0) {
            System.out.println("ESTAMOS QUE NOS CONGELAMOS");

        }else if (grades>=1 && grades <=10){
            System.out.println("ESTÁ HACIENDO MUCHO FRÍO");

        }else if (grades>=11 && grades <=15){
            System.out.println("EL CLIMA ESTÁ FRESCO");

        }else if (grades>15 && grades <22){
            System.out.println("LLEGÓ LA PRIMAVERA");

        }else{
            System.out.println("HACE CALOR");
        }

    }
}
