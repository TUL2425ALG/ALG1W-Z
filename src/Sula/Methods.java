/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sula;

/**
 *
 * @author Sula-J-aac4
 */
public class Methods {
    
    
    public static boolean arePositiveAndSumDiagonalsSame(int[][] matice){
        
        int mainDiagonalCount = 0;
        int secondaryDiagonalCount = 0;
        for (int i = 0; i<matice.length; i++){
            mainDiagonalCount += matice[i][i];
            secondaryDiagonalCount += matice[i][matice.length-i-1];
            
            /* Pouze test součtu diagonál
            System.out.println("main " + mainDiagonalCount);        
            System.out.println("Secondary " + secondaryDiagonalCount);
            */
            
            for (int j = 0; j<matice[i].length-1; j++){
                if (matice[i][j] < 0){
                    return false;
                }
                
                
            }
        }
        
        if (mainDiagonalCount != secondaryDiagonalCount){
            return false;
        }
        

        return true;
    }
    
    public static int[] createPalindrom(int[] posloupnost){
        int[] palindromPosloupnost = new int[posloupnost.length*2-1];
        
        for (int i = 0; i < posloupnost.length; i++){
            palindromPosloupnost[i] = posloupnost[i];
            palindromPosloupnost[palindromPosloupnost.length-i-1] = posloupnost[i];
        }
        
        
        /* Pouze test, ale nechávám si to tady
        for (int i = 0; i < palindromPosloupnost.length; i++){
            System.out.println(palindromPosloupnost[i]);
        }
        System.out.println("PosloupnostLength");
        System.out.println(posloupnost.length);
        System.out.println("PalindromPosloupnostLength");
        System.out.println(palindromPosloupnost.length);
        */
        return palindromPosloupnost;
    }
    
    
    public static void main(String[] args) {
        int[] pole = {1,5,8};
        //int[][] matice = { {5,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4} }; // False, hlavní diagonála má jiný součet než vedlejší
        //int[][] matice = { {-1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4} }; // False, obsahuje záporné číslo
        int[][] matice = { {1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4} }; //True. vše splňuje
        createPalindrom(pole);
        
        System.out.println(arePositiveAndSumDiagonalsSame(matice));
    }
}
