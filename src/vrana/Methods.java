/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vrana;

/**
 *
 * @author Vrana-T-183a
 */
public class Methods {

    public static void main(String[] args) {
        //matice
//        int matice[][] = new int[2][2];
//        matice[0][0] = 1;
//        matice[0][1] = 1;
//        matice[1][0] = 1;
//        matice[1][1] = 1;
        int[][] matice = {{1, 1, 1}, {1, 2, 1}, {3, 1, 3}};
        if (arePositiveAndSumDiagonalsSame(matice) == true) {
            System.out.println("1. PRAVDA");
        } else {
            System.out.println("1. NEPRAVDA");
        }
        //posloupnost
        int[] posloupnost = new int[3];
        posloupnost[0] = 1;
        posloupnost[1] = 2;
        posloupnost[2] = 3;
        int[] palindrom = createPalindrom(posloupnost);
        for (int i = 0; i < palindrom.length; i++) {
            System.out.print("" + palindrom[i]);
        }
        System.out.println("");
        //filleven
        int[][] mat = fillEven(2, 2);
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean arePositiveAndSumDiagonalsSame(int m[][]) {
        int soucethl = 0;
        int soucetdiag = 0;
        for (int i = 0; i < m.length; i++) {
            soucethl = soucethl + m[i][i];
            soucetdiag = soucetdiag + m[i][m.length - 1 - i];
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] < 0) {
                    return false;
                }
            }
        }
        if (soucethl != soucetdiag) {
            return false;
        }
        return true;
    }

    public static int[] createPalindrom(int[] pole) {
        int[] palindrom = new int[(2 * pole.length) - 1];
        for (int i = 0; i < pole.length; i++) {
            palindrom[i] = pole[i];
            palindrom[(2 * pole.length) - 1 - 1 - i] = pole[i];
        }
        return palindrom;
    }

    public static int[][] fillEven(int sloupce, int radky) {
        int[][] m = new int[sloupce][radky];
        int c = 1;
        for (int i = 0; i < sloupce; i++) {
            for (int j = 0; j < radky; j++) {
                m[j][i] = 3 * c;
                c++;
            }
        }
        return m;
    }
}
