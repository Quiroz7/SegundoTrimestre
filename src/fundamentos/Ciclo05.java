package fundamentos;
import java.util.Scanner;

public class Ciclo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre y apellido del estudiante: ");
        String name = sc.nextLine();
        System.out.println("Ingrese número de créditos: ");
        float numbers = sc.nextFloat();
        System.out.println("Ingrese el estrato del estudiante: ");
        float estrato = sc.nextFloat();
        float costomatri = numbers*85000;

        int contanumbercreditos  = 0;
        int contadorcrediextra = 0;
        int contadorestrato1 = 0;
        int contadorestrato2 = 0;
        int contadorestrato3 = 0;

        if (numbers <=20){
            System.out.println("El estudiante"+" "+ name+ " "+ costomatri );
            contanumbercreditos++;

        }else if (numbers>20){
            System.out.println("El estudiante"+" "+name+" "+(costomatri*2));
            contanumbercreditos++;

        }else if (estrato==1||estrato==2||estrato==3) {

        }if (estrato==1) {
            System.out.println("El descuento es del 80%" + " "+ (costomatri-(costomatri*0.80)));
            contadorestrato1++;
            float bono1 = 200000;


        }else if (estrato==2) {
            System.out.println("El descuento es del 50%"+ " "+(costomatri-(costomatri*0.50)));
            contadorestrato2++;
            float bono2 = 100000;


        }else if (estrato==3){
            System.out.println("El descuento es del 30%"+" "+(costomatri-(costomatri*0.30)));
            contadorestrato3++;
        }
        System.out.println("el estudiante: "+" "+ name);
        //System.out.println("Costo de matricula: "+" "+ );
        System.out.println("Valor del subsidio: "+" "+ estrato);


    }
}
