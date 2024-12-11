/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamecky;

import java.util.Scanner;

/**
 *
 * @author Zamecky-T-45b4
 */
public class AppMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej velikost n pro čtvercovou matici: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Zadej hodnoty matice: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        String test = (Methods.arePositiveAndSumDiagonalSame(matrix)) ? "Test prošel" : "Test neprošel";
        System.out.println(test);
    }
}
