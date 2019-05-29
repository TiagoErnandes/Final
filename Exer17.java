import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        int[] primo = new int[100];
        boolean numPrimo = true;
        int cont = 2;
        for (int i = 0; i < 100; i++) {

            for (int j = 2; j < cont; j++) {
                if (cont % j == 0) {
                    numPrimo = false;
                    i--;
                    break;
                } else {
                    numPrimo = true;
                }
            }
            if (numPrimo) {
                primo[i] = cont;
            }
            cont++;
            numPrimo = true;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(" " + primo[i]);
        }
    }
}
