package herencia01;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner words = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            Estudiante student = new Estudiante();
            Empleado employee = new Empleado();

            System.out.println("Nombre: ");
            student.nombre = sc.nextLine();
            System.out.println("Dirección: ");
            student.direccion= sc.nextLine();
            System.out.println("Número de Teléfono: ");
            student.nroTelefono = sc.nextLine();
            System.out.println("Correo Electrónico: ");
            student.correoElectronico = sc.nextLine();
            System.out.println("Su estado es: ");
            student.setEstado(sc.nextInt());

            System.out.println(student.toString());

            System.out.println("Nombre: ");
            employee.nombre = words.nextLine();
            System.out.println("Dirección: ");
            employee.direccion= words.nextLine();
            System.out.println("Número de Teléfono: ");
            employee.nroTelefono = words.nextLine();
            System.out.println("Correo Electrónico: ");
            employee.correoElectronico = words.nextLine();
            System.out.println("Departamento: ");
            employee.setDepartamento(words.nextLine());
            System.out.println("Salario: ");
            employee.salario = words.nextFloat();
            System.out.println("Fecha de Contratación: ");
            employee.fechaContrat = words.nextLine();

            System.out.println(employee.toString());










        }
    }

