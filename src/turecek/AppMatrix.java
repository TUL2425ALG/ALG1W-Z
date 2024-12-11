/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turecek;

import java.util.Scanner;


public class AppMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("zadejte velikost matice: ");
        int velikost = sc.nextInt();
        int[][]matrix = new int[velikost][velikost];
        loadMatrix(matrix);
        arePositiveAndSumDiagonalSame(matrix);
    }
    
        public static void arePositiveAndSumDiagonalSame(int[][]matrix){
        boolean ispositive = true;
        int summain = 0;
        int sumved = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]<0){
                    ispositive = false;
                }
            }
            
        }
        for (int i = 0; i < matrix.length; i++) {
           summain = summain + matrix[i][i]; 
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length -1; j < -1; j--) {
                
            }
        }
        
        
    }
        public static int [][] loadMatrix(int[][] matrix){
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
                
            }
            
            return matrix;
        }
}
