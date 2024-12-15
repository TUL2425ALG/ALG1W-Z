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
public class AppArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        while(cond){
            //Input
            System.out.println("Pokračujeme ve zpracování (a/n)");
            String test = sc.next();
            if(test.charAt(0) == 'n' || test.charAt(0) == 'N'){
                break;
            }
            System.out.println("Počet hodnot: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Hodnoty: ");
            for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            }
            System.out.println("Palindrom:");
            //Processing is Methods.createPalindrom(nums); and Output is Methods.printAr(Methods.createPalindrom(nums));
            Methods.printAr(Methods.createPalindrom(nums));
        }  
    }
}
