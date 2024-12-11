/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turecek;

import java.util.Scanner;


public class AppArray {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        
        do{
        System.out.println("Zadejte velikost vektoru: ");
        int velikost = sc.nextInt();
        if(velikost < 0){
            end = true;
            break;
        }
        int [] array = new int[velikost];
        loadArray(array);
        int[] palindrom = new int[(array.length) *2];
        createPalindrom(array, palindrom);
        printPalindrom(palindrom);
        }while(!end);
    }
    public static int[] loadArray(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("zadavejte hodnoty: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            
        }
        return array;
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
        
        public static void printPalindrom(int[] palindrom){
            System.out.println("  ");
            for (int i = 0; i < palindrom.length; i++) {
                System.out.println(palindrom[i]);
            }
        }
}
