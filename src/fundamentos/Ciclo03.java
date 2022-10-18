package fundamentos;

public class Ciclo03 {
    public static void main(String[] args) {
        int elconta = 1;
        while (elconta <= 10) {
            if (elconta == 6) {
                elconta++;
                break;
            }
            System.out.println("los números son: " + "  " + elconta);
            elconta++;
        }
    }
}
