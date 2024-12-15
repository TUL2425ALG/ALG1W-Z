package Springl;

import java.util.Scanner;

public class AppArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int velikost = sc.nextInt();
            if (velikost == 0) {
                break;
            }
            int n[] = new int[velikost];
            for (int i = 0; i < velikost; i++) {
                n[i] = sc.nextInt();
            }
            System.out.print("{");
            for (int i = 0; i < Methods.createPalindrom(n).length; i++) {
                System.out.print(Methods.createPalindrom(n)[i] + ",");

            }
            System.out.println("}");
        }
    }
}
