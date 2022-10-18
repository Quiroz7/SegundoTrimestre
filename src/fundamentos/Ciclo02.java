package fundamentos;

public class Ciclo02 {
    public static void main(String[] args) {
        int elconta = 1;
        while (elconta <= 10) {
            if (elconta == 5) {
                elconta++;
                continue;
            }
            System.out.println("los números son: " + "  " + elconta);
            elconta++;
        }
    }
}
