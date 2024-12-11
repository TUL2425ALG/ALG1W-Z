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
public class AppArray {
    
    public static void main(String[] args) {
        int number_count = 1;
        Scanner sc = new Scanner(System.in);
        
        while(number_count != 0){

            System.out.println("Kolik cisel zadate?");
            number_count = sc.nextInt();
        
            System.out.println("Zadavejte cisla");
            int[] baseArray = new int[number_count];
            for (int i = 0; i < number_count; i++) {
                baseArray[i] = sc.nextInt();
            }
        
            int[]Pallindromic = Methods.createPalindrome(baseArray);
        
            System.out.print("{");
            for (int i = 0; i < Pallindromic.length-1; i++) {
                System.out.printf("%d, ",Pallindromic[i]);
            }
            System.out.printf("%d}",Pallindromic[Pallindromic.length]);
            
            System.out.println("");
            System.out.println("Zadanim 0 ukoncite program");
        }
    }
}
