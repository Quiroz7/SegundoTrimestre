package ui;

import java.util.Scanner;

public class Uimenu {

    public static  final String [] MESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    public static void showMenu() {
        System.out.println("Bienvenido a mis agendas");
        System.out.println("Selecciona la opción deseada");

        int respuesta = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    respuesta = 0;
                    showPacienteMenu();
                    break;
                case 0:
                    System.out.println("Thanks a lot for visiting us");
                    break;
                default:
                    System.out.println("Por Favor, selecciona una opción correcta");
            }
        } while (respuesta != 0);
    }

    public static void showPacienteMenu() {
        int respuesta = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("1. Reservar una cita");
            System.out.println("2. Conocer mis citas");
            System.out.println("3. Regresar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta) {
                case 1:
                    System.out.println("Reservar una cita");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + "."+ MESES[i]);
                    }
                    break;
                case 2:
                    System.out.println("Mis citas");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (respuesta != 0);
    }
}