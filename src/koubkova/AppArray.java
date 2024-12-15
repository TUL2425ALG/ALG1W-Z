package koubkova;

import java.util.Scanner;
import static koubkova.Methods.createPalindom;

public class AppArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean konec = false;
        while (!konec) {
            System.out.println("Zadej počet členů posloupnosti:");
            int n = sc.nextInt();
            int[] posloupnost = new int[n];
            for (int i = 0; i < posloupnost.length; i++) {
                posloupnost[i] = sc.nextInt();
            }
            int[] palindom = createPalindom(posloupnost);
            for (int i = 0; i < palindom.length; i++) {
                if (i == 0) {
                    System.out.print("[" + palindom[i] + ", ");
                }
                if (i == palindom.length - 1) {
                    System.out.println(palindom[i] + "]");
                } else {
                    System.out.print(palindom[i] + ", ");
                }
            }
            System.out.println("Zadej 0 pro ukončení programu.");
            if (n == 0) {
                konec = true;
            }
        }
    }

}
