/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turecek;


public class Methods {
    public static void main(String[] args) {
            int [][] matrix = new int[3][3];
            int[] array = new int[5];
            int[] palindrom = new int [array.length * 2];
            
    
        arePositiveAndSumDiagonalSame(matrix);
        createPalindrom(array, palindrom);
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
        public static int[] createPalindrom(int[]array, int[] palindrom){
        if(array.length%2 == 1){
            for (int i = 0; i < array.length; i++) {
                palindrom[i] = array[i];
                
                palindrom [palindrom.length-1 -i] = array [i];
            }
            palindrom[array.length-1] = array[array.length - 1];
        }
        for (int i = 0; i < array.length; i++) {
                palindrom[i] = array[i];
                
                palindrom [palindrom.length-1 -i] = array [i];
            }
        return palindrom;
    }
}
