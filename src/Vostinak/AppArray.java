package Vostinak;

import static Vostinak.Methods.createPalindrom;
import java.util.Scanner;

public class AppArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pokracovani = true;

        while (pokracovani) {
            System.out.println("Zadejte pocet cisel (zadejte 0 pro ukonceni): ");
            int pocet = sc.nextInt();
            
            if(pocet <= 0){
                System.out.println("Ukonceni programu");
                return;
            }
            
            int[] pole = new int[pocet];
            System.out.println("Zadejte cisla: ");
            for (int i = 0; i < pocet; i++) {
                pole[i] = sc.nextInt();
            }

            int[] palindrom = createPalindrom(pole);
            System.out.print("{");
            for (int i = 0; i < palindrom.length - 1; i++) {
                System.out.print(palindrom[i] + ", ");
            }
            System.out.print(palindrom[palindrom.length - 1] + "}");
            System.out.println("");
        }
    }
}
