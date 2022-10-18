package fundamentos;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ciclo04 {
    public static void main(String[] args) {

        DecimalFormat dec = new DecimalFormat("0.00");
        Scanner ple = new Scanner(System.in);
        System.out.println("Ingrese el número de personas a realizar la encuenta: ");
        int people = ple.nextInt();
         int contadorp = 1;
         int contadorbp = 0;
         int contadornormal = 0;
         int contadorsobrep = 0;
         int contadorobesi = 0;

         while (contadorp <= people) {
              Scanner sc = new Scanner(System.in);
              double peso, estatura, imc;
              System.out.println("Cual es su peso?: ");
              peso = sc.nextDouble();
              System.out.println("Cual es tu estatura en mts?: ");
              estatura = sc.nextDouble();
              imc = peso / (estatura * estatura);
              System.out.println("SU IMC ES DE: " + dec.format(imc));


              if (imc < 18.5) {
                  System.out.println(" TIENES BAJO PESO");
                  contadorbp++;

              } else if (imc >= 18.5 && imc <= 24.9) {
                  System.out.println(" ES NORMAL");
                  contadornormal++;

              } else if (imc >= 25 && imc <= 29.9) {
                  System.out.println("TIENES SOBREPESO");
                  contadorsobrep++;

              } else {
                  System.out.println("PRESENTE OBESIDAD");
                  contadorobesi++;


              } contadorp++;
         }
         System.out.println("El número de personas que realizaron la encuenta fué de: " + (contadorp-1));
         System.out.println("La cantidad de personas con un IMC de bajo peso fueron de: "+ contadorbp);
         System.out.println("La cantidad de personas con un IMC normal fueron de: "+ contadornormal );
         System.out.println("La cantidad de personas con un IMC de sobre peso fueron de: "+ contadorsobrep );
         System.out.println("La cantidad de personas con un IMC de obesidad fueron de: "+ contadorobesi );

            }
        }



