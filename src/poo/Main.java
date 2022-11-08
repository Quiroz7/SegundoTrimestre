package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner words = new Scanner(System.in);
        Scanner fin = new Scanner(System.in);
        ArrayList<Persona> people = new ArrayList<>();    //

        do {

            Persona pers = new Persona();

            System.out.println("Documento: ");
            pers.setDocumento(sc.nextLine());
            System.out.println("Nombre: ");
            pers.setNombre(words.nextLine());
            sc.nextLine();
            System.out.println("Edad: ");
            pers.setEdad(sc.nextInt());
            System.out.println("Sexo:  M o F ");
            pers.setSexo(words.next().charAt(0));
            System.out.println("Peso: ");
            pers.setPeso(sc.nextDouble());
            System.out.println("Altura: ");
            pers.setAltura(sc.nextDouble());
            System.out.println(pers.toString());

            people.add(pers);                                           //

            System.out.println("Desea ingresar otra persona? ");
            sc.nextLine();


        } while (fin.nextLine().equals("si"));
        System.out.println("Thanks a lot for using our service");
        System.out.println("*************************************");   //
        System.out.println("Elementos/Objetos en la Lista ");          //

        for(int i = 0; i < people.size(); i++) {                       //
            System.out.println(people.get(i).getNombre());             //
        }
    }
}
