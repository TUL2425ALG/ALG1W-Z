/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vavra;

import java.util.Scanner;

/**
 *
 * @author Vavra-V-e4e5
 */
public class AppMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        while(cond){
            System.out.println("Pokračujeme ve zpracování (a/n)");
            String test = sc.next();
            if(test.charAt(0) == 'n' || test.charAt(0) == 'N'){
                break;
            }
            System.out.println("Velikost čtvercové matice: ");
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
            System.out.println("Hodnoty "+(i+1)+". řádku matice: ");
            for(int j = 0; j < n; j++){
            matrix[i][j] = sc.nextInt();
            }
            }
            System.out.println("Výsledná matice:");
            Methods.printAr(matrix);
            System.out.println(Methods.arePositiveAndSumDiagonalsSame(matrix) ? "Součty jsou stejné na obou diagonálách a všechna čísla jsou kladná" : "Součty nejsou stejné nebo nejsou všechna čísla kladná");
        }  
    }
}
