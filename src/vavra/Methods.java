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
    public static boolean arePositiveAndSumDiagonalsSame(int[][] matrix) { //matrix test 
        for(int i = 0; i < matrix.length; i++){ //all positive
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]<=0){
                    return false;
                }
            }
        }
        int sum_main = 0;
        int sum_sub = 0;
        for(int i = 0; i < matrix.length; i++){ //diagonals the same val
            sum_main = sum_main + matrix[i][i];
            sum_sub = sum_sub + matrix[matrix.length-1-i][i];
        }
        return(sum_main == sum_sub);
    }
    
    public static int[] createPalindrom(int[] nums) { //palindrom 1 2 3 4 3 2 1
        int[] palindrom = new int[nums.length*2-1];
        for(int i = 0; i < nums.length; i++){
            palindrom[i] = nums[i];
            palindrom[palindrom.length-1-i] = nums[i];
        }
        return palindrom;
    }
    
    public static boolean constantSumNextTwo(int[] nums) { //test constantni soucet dvojic
        int sum = nums[0] + nums[1];
        for(int i = 0; i < nums.length/2; i++){
            if((nums[2*i] + nums[2*i+1]) != sum){return false;}
        }
        return true;
    }
    
    public static int[][] fillEven(int m, int n) { //nasobky 3 napsanych do radku matice
        int num = 3;
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
        matrix[i][j] = num;
        num = num + 3;
        }
        }
        return matrix;
    }
    
    public static int maxDigit(int[][] matrix){ //digit test
        int max = 0;
        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[i].length; j++){
                int digit = matrix[i][j] < 0 ?(int)Math.log10(-matrix[i][j])+ 2 : (int)Math.log10(matrix[i][j])+1;
                if (digit > max){ max = digit;}
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
    
    public static void printAr(int[] ar, int max_digit) { //digit_dependant print
        for(int i = 0; i < ar.length - 1; i++){
        System.out.print(ar[i]);
        int digit = ar[i] < 0 ?(int)Math.log10(-ar[i])+ 2 : (int)Math.log10(ar[i])+1;
        for(int j = 0; j < (max_digit - digit); j++){
            System.out.print(" ");
        }
        System.out.print(" ");
        }
        System.out.println(ar[ar.length-1]);
    }
    
    public static void printAr(int[][] ar) { //digit_dependant print
        int max_digit = maxDigit(ar);
        for(int i = 0; i < ar.length; i++){
        printAr(ar[i], max_digit);
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {2,5,6,8,7,9};
        int[] nums2 = {1,9,2,8,3,7};
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
        System.out.println(maxDigit(matrix));
        System.out.println(arePositiveAndSumDiagonalsSame(matrix));
        System.out.println(constantSumNextTwo(nums));
        System.out.println(constantSumNextTwo(nums2));
        printAr(fillEven(4,6));
    }
}
