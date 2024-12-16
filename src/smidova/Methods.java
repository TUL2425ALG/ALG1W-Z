package smidova;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej rozmer matice: ");
        int m = sc.nextInt();
        int[][] a = new int[1][m];
        System.out.println("Vypis hodnoty matice: ");
        arePositiveAndSumDiagonalsSame(a);
    }

    public static void arePositiveAndSumDiagonalsSame(int[][] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();

                System.out.printf("%5d", a[i][j]);
                //(a[i][j] > 0) ? "Je kladna" : "Neni kladna" ;
            }

            System.out.println("");
            //JV nebylo potreba nic nacitat ani vypisovat, jen zjistit jestli sumy na diagonalach jsou stejne a matice obsahuje jen kladne prvky
        }
    }

    public static void createPalindrom(int[][] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej hodnoty");
        int radek = 1;
        for (int i = 0; i < a.length; i++) {
            a[radek][i] = sc.nextInt();
        }
        //a[0] a[1] a[2] a[3] = a[2]4 a[1]5 a[0]6
        //a[0] a[1] a[2] a[3] = a[i-2] a[i-1] a[i - 0]
        a = new int[1][3];
        int[] b = {1, 2, 3};
        System.out.println(b);
        //JV metoda mala jen dostat 1D pole napr 1 2 3 a vratit nove pole 1 2 3 2 1
        //JV je to metoda logiky neni potreba nacitat ani vypisovat
    }
}
