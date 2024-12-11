/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vavra;

/**
 *
 * @author Vavra-V-e4e5
 */
public class Methods {
    public static boolean arePositiveAndSumDiagonalsSame(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]<=0){
                    return false;
                }
            }
        }
        int sum_main = 0;
        int sum_sub = 0;
        for(int i = 0; i < matrix.length; i++){
            sum_main = sum_main + matrix[i][i];
            sum_sub = sum_sub + matrix[matrix.length-1-i][i];
        }
        return(sum_main == sum_sub);
    }
    
    public static int[] createPalindrom(int[] nums) {
        int[] palindrom = new int[nums.length*2-1];
        for(int i = 0; i < nums.length; i++){
            palindrom[i] = nums[i];
            palindrom[palindrom.length-1-i] = nums[i];
        }
        return palindrom;
    }
    
    public static int maxDigit(int[][] matrix){
        int max = 0;
        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[i].length; j++){
                //digit here
            }
        }
        return max;
    }
    
    public static void printAr(int[] ar) {
        for(int i = 0; i < ar.length - 1; i++){
        System.out.print(ar[i]);
        System.out.print(" ");
        }
        System.out.println(ar[ar.length-1]);
    }
    
    public static void printAr(int[][] ar) {
        for(int i = 0; i < ar.length; i++){
        printAr(ar[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {2,5,6,8,7,9};
        int[][] matrix = new int[3][3];
        int[] matrix0 = {10, 2, 12};
        int[] matrix1 = {4, 7777, 6};
        int[] matrix2 = {7, 8, 9};
        for(int i = 0; i < 3; i++){
            matrix[0][i] = matrix0[i]; 
            matrix[1][i] = matrix1[i]; 
            matrix[2][i] = matrix2[i]; 
        }
        printAr(createPalindrom(nums));
        printAr(matrix);
        System.out.println(arePositiveAndSumDiagonalsSame(matrix));
    }
}
