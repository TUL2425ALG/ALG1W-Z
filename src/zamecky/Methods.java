/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamecky;

/**
 *
 * @author Zamecky-T-45b4
 */
public class Methods {

    public static void main(String[] args) {

    }

    public static boolean arePositiveAndSumDiagonalSame(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= 0) {
                    return false;
                }
            }
        }
        int soucetHlavni = 0;
        int soucetVedlejsi = 0;
        for (int i = 0; i < matrix.length; i++) {
            soucetHlavni += matrix[i][i];
        }
        for (int i = 0; i < matrix.length; i++) {
            int j = matrix.length - i - 1;
            soucetVedlejsi += matrix[i][j];
        }
        if (soucetHlavni != soucetVedlejsi) {
                    return false;
                }
        return true;
    }

    public static int[] createPalindrom(int[] pole) {
        int pulka = pole.length / 2;
        int[] posloupnost = new int[pole.length];
        int prostredek = 3;
        for (int i = 0; i < pulka; i++) {
                pole[i] = posloupnost[i];
        }
        if (pole.length % 2 == 1){
            posloupnost[pulka] = prostredek;
        }
    }

    public static void fillEven(int[][] matrix, int[][] newMatrix) {
        // Metoda projde program a vypíše hodnoty, které zároven vynásobí daným číslem (3)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i * 3][j * 3]);
            }
        }
    }
}
