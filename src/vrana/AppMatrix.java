/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vrana;

import java.util.Scanner;

/**
 *
 * @author Vrana-T-183a
 */
public class AppMatrix {

    public static void main(String[] args) {
        // VSTUPNÍ HODNOTA NAPŘ.
        // 11
        // 11
        //JV Zbytecne si nekomplikujte nacitani - nactete rozmer a pak postupne prvky
        Scanner sc = new Scanner(System.in);
        System.out.println("Vypiš matici po řádcích.");
        String radek = sc.nextLine();
        radek.replaceAll(" ", "");

        int[][] mat = new int[radek.length()][radek.length()];
        for (int i = 0; i < radek.length(); i++) {
            mat[0][i] = radek.charAt(i);
        }
        for (int j = 1; j < radek.length(); j++) {
            radek = sc.nextLine();
            radek.replaceAll(" ", "");
            for (int i = 0; i < radek.length(); i++) {
                mat[j][i] = radek.charAt(i);
            }
        }
        boolean hodnota = arePositiveAndSumDiagonalsSame(mat);
        if (arePositiveAndSumDiagonalsSame(mat) == true) {//JV staci psat if (arePositiveAndSumDiagonalsSame(mat))
            System.out.println("Pravda!");
        } else {
            System.out.println("Nepravda!");
        }
    }

    public static boolean arePositiveAndSumDiagonalsSame(int m[][]) {
        int soucethl = 0;
        int soucetdiag = 0;
        for (int i = 0; i < m.length; i++) {
            soucethl = soucethl + m[i][i];
            soucetdiag = soucetdiag + m[i][m.length - 1 - i];
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] < 0) {
                    return false;
                }
            }
        }
        if (soucethl != soucetdiag) {
            return false;
        }
        return true;
    }
}
