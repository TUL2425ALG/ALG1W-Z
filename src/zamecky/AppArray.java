/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamecky;

import java.util.Scanner;

/**
 *
 * @author Zamecky-T-45b4
 */
public class AppArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Zadání
        //char odpoved = sc.next().charAt(0);
        int[] posloupnost = new int[100];
        int pocet = 0;
        System.out.println("Zadej číslo (pro ukončení zadej zápornou hodnotu): ");
        int num = sc.nextInt();
        while (num <= 0){
            posloupnost[pocet] = num;
            pocet++;
            num = sc.nextInt();
        }
        for (int i = 0; i < pocet; i++){
            System.out.print(posloupnost[i] + " ");
        }
    }
}
