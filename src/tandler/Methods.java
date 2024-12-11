/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tandler;

/**
 *
 * @author Tandler-D-0f5f
 */
public class Methods {
    public static int[]createPalindrome(int[]inputArray){
        int[]Pallindromic = new int[((inputArray.length * 2)-1)];
        for (int i = 0; i < inputArray.length; i++) {
            Pallindromic[i] = inputArray[i];
            Pallindromic[(Pallindromic.length-i)] = inputArray[i];
        }
        return Pallindromic;
    }
    public static boolean arePositiveAndSumDiagonalIsSame(int[][]inputSquareMatrix){
        boolean matches_conditions = true;
        if(arePositive(inputSquareMatrix) == false){
            matches_conditions = false;
        }
        if(SumDiagonalIsSame(inputSquareMatrix) == false){
            matches_conditions = false;
        }
        return matches_conditions;
    }
    
    public static boolean arePositive(int[][]inputSquareMatrix){
        boolean valid = true;
        for (int i = 0; i < inputSquareMatrix.length; i++) {
            for (int j = 0; j < inputSquareMatrix.length; j++) {
                if(inputSquareMatrix[i][j] <= 0){
                    valid = false;
                    break;
                }
            }
            if(valid = false)
                break;
        }
        return valid;
    }
    public static boolean SumDiagonalIsSame(int[][]inputSquareMatrix){
        int main_diag_sum = 0;
        int side_diag_sum = 0;
        
        for (int i = 0; i < inputSquareMatrix.length; i++) {
            main_diag_sum += inputSquareMatrix[i][i];
        }
        for (int i = 0; i < inputSquareMatrix.length; i++) {
            side_diag_sum += inputSquareMatrix[inputSquareMatrix.length-i][inputSquareMatrix.length-i];
        }
        if(main_diag_sum == side_diag_sum){
            return true;
        }
        else
            return false;
    }
}
