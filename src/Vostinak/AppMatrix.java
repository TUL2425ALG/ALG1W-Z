package Vostinak;

import static Vostinak.Methods.arePositiveAndSumDiagonalsSame;
import java.util.Scanner;

public class AppMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte velikost ctvercove matice: ");
        int velikost = sc.nextInt();
        
        int[][] matice = new int[velikost][velikost];
        System.out.println("Zadejte cisla jednotlivych prvku: ");
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j < matice.length; j++){
                matice[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j < matice.length; j++){
                System.out.print(matice[i][j] + " ");
            }
            System.out.println("");
        }
        
        String vysledekMetody = arePositiveAndSumDiagonalsSame(matice) ? "Matice ma jen kladna cisla a soucet diagonal je stejny." : "Matice nema kladna cisla nebo soucet diagonal neni stejny.";
        System.out.println(vysledekMetody);
    }
}
