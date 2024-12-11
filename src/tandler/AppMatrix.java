/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tandler;

import java.util.Scanner;

/**
 *
 * @author Tandler-D-0f5f
 */
public class AppMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak velka bude ctvercova matice?");
        int dimension = sc.nextInt();
        int[][] Array = new int[dimension][dimension];
        
        System.out.println("Zadavejte cisla matice");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                Array[i][j] = sc.nextInt();
            }
        }
        boolean matches_conditions = Methods.arePositiveAndSumDiagonalIsSame(Array);
        
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.printf("%d ",Array[i][j]);
            }
            System.out.println("");
        }
        
        if(matches_conditions){
            
        }
        else{
            
        }
            
    }
}
