package poo;

import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner words = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Nombre del empleado: ");
        employee.setName(words.nextLine());
        System.out.println("Digite Salario: ");
        employee.setSalary(sc.nextFloat());
        System.out.println("Digite número de horas: ");
        employee.setNumeroHours(sc.nextFloat());

        System.out.println(employee.toString());
        //System.out.println(employee.agregarSalario(employee.salary));



    }
}
