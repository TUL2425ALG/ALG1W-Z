/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package krupka;

/**
 *
 * @author Krupka-M-4d24
 */
public class Methods {

    /**
     *
     * @param a
     * @return
     */
    public static boolean arePositiveAndSumDiagonalsSame(int[][] a) {
        a = matice;
        int n = a.length;
        boolean kladna = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] < 0) {
                    kladna = false;
                }
            }
            return kladna;
        }
        if (kladna == true) {
            int sumaHlavni = 0;
            for (int i = 0; i < n; i++) {
                for (i = 0; i < n; i++) {
                    sumaHlavni = sumaHlavni + a[i][i];
                }
            }
            int sumaVedlejsi = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sumaVedlejsi = sumaVedlejsi + a[i][n - i];
                }
            }
            boolean stejne = false;
            if (sumaHlavni == sumaVedlejsi) {
                stejne = true;
            }
            return stejne;
        }
    }

    public static void createPalindom(String[] args) {
        int[] posloupnost = a/2;
        int[] obracena_posloupnost = a/2;
        int[] palindom = posloupnost + obracena_posloupnost
        int a = posloupnost.length * 2;
        if(posloupnost.length % 2 != 0){
            a = a - 1;
        }
        for(int i = 0; i < ; i++)
        
        
    }
}
