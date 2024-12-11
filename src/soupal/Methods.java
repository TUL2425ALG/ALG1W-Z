package soupal;

import java.util.Scanner;

/**
 *
 * @author Soupal-J-446d
 */
public class Methods {

    //testovani
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[][]matrix = new int[n][m];
//        
//        System.out.println("Kolik prvku bude mit polynom?: ");
//        int u = sc.nextInt();
//        System.out.println("Zadej prvky polynomu: ");
//        int[] polynom = new int[u];
//        for(int i =0; i<u; i++){
//            polynom[i]= sc.nextInt();
    }

    //metody
//    public static boolean arePositiveAndSumDiagonalsSame(int[][] matrix) {
//
//    }

    /**
     * nacte pole, vytvori nove, ktere ma 2*u-1 delku a prida do neho hodnoty
     * zrcadlove (soumerne podle posledniho prvku puvodniho pole)
     */
    public static int[] createPalindom(int[] polynom, int u) {

        int[] palindom = new int[u * 2 - 1];
        palindom = polynom;
        for (int i = u - 2; i < u * 2; i++) {
            for (int j = u; j == 0; j--) {
                palindom[j] = palindom[i];
            }
        }
        for (int j = 0; j == u*2-1; j++) {
            System.out.println(palindom[j]);
        }
        return palindom;
    }
}
