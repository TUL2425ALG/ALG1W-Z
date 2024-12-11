package soupal;

import java.util.Scanner;
import static soupal.Methods.createPalindom;

/**
 *
 * @author Soupal-J-446d
 */
public class AppArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik prvku bude mit polynom?: ");
        int u = sc.nextInt();
        System.out.println("Zadej prvky polynomu: ");
        int[] polynom = new int[u];
        for (int i = 0; i < u; i++) {
            polynom[i] = sc.nextInt();
        }
        
        createPalindom(polynom,u);
    }

}
