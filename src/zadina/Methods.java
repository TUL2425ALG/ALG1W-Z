
package zadina;

import java.util.Scanner;
public class Methods {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
    }
    
    public static boolean arePositiveAndSumDiagonalsSame(int[][] matrix){
        boolean result = false;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                
                if(matrix[i][j] < 1){
                    return false;
                }
                
            }
            
        }
        
        // zde projedu hlavní diagonálu
        int mainDiagonalSum = 0;
        int sloupce = 0;
        for (int i = 0; i < matrix.length; i++) {
            
            
                
                mainDiagonalSum += matrix[i][sloupce];
                
           
            sloupce++;
        }
        
        // zde projedu vedlejší diagonálu
        int sideDiagonalSum = 0;
        sloupce = matrix.length-1;
        
        for (int i = 0; i < matrix.length; i++) {
            
            sideDiagonalSum += matrix[i][sloupce];
            
            sloupce--;
            
        }
        
        if(mainDiagonalSum == sideDiagonalSum){
            return true;
        }
       return false;
    }
    
    public static int[] createPalindom(int[] posloupnost){
        int[] result = new int[(posloupnost.length*2)-1];
        
        
        
        return result;
    }
}
