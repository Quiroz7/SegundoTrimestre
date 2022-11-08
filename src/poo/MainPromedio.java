package poo;

import java.util.Scanner;

public class MainPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PromedioJava pro = new PromedioJava();

        System.out.println("Digite el número: ");
        pro.setN1(sc.nextInt());
        System.out.println("Digite el número: ");
        pro.setN2(sc.nextInt());
        System.out.println("Digite el número: ");
        pro.setN3(sc.nextInt());

        System.out.println("el promedio de los números es: " + pro.calcularPromedio(pro.n1, pro.n2, pro.n3));



    }
}
