package fundamentos;

public class Ciclo01 {
    public static void main(String[] args) {


                int contador=1;
                for(contador=1;contador<=10;contador++){
                    System.out.println(contador+ " " +"Hola Mundo en for");
                }
                System.out.println("_________________________");

                int elcontador = 1;
                while (elcontador<=10){
                    System.out.println(elcontador + " " + "Hola Mundo en while");
                    elcontador++;
                }
                System.out.println("__________________________");

                int micontador = 1;
                do{
                    System.out.println(micontador + " "+ "Hola mundo en Do-While");
                    micontador++;

                }while (micontador<=10);

            }
        }

