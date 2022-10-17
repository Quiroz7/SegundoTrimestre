package fundamentos;

import java.util.Scanner;

public class Condicional04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del empleado: ");
        String name = sc.nextLine();
        System.out.println("Ingrese salario de "+ name);
        float salary = sc.nextFloat();
        System.out.println("Ingrese antiguedad del empleado en la empresa: ");
        int ages = sc.nextInt();

        if (salary<2340000 || ages>10){
            System.out.println("Al o la  empleadQ: "+name+" Se le otorgará aumento del salario");

        }else{
            System.out.println("el o la emplead@: "+name+" No cumple con los requisitos para el aumento");
        }

    }
}
