package smidova;

import java.util.Scanner;

public class AppMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej rozmer matice: ");
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        System.out.println("Vypis hodnoty matice: "); //JV Chtelo to jeste nacist hodnoty matice
        Methods.arePositiveAndSumDiagonalsSame(a); //JV metoda vrati true/false - chtelo to vypsat

    }
}
