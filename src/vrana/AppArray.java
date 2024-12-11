/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vrana;

import java.util.Scanner;

/**
 *
 * @author Vrana-T-183a
 */
public class AppArray {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int cont = 0;
                    while(cont == 0)
                    {
                        //in
                        System.out.println("Zadej posloupnost");
                        String in = sc.nextLine();
                        int[] pole1 = new int[in.length()];
                        for(int i = 0; i < in.length(); i++)
                        {
                            pole1[i] = in.charAt(i)-48;
                        }
                        //metoda
                        int[] palindrom = createPalindrom(pole1);
                        // out
                        System.out.print("{");
                        for (int i = 0; i< palindrom.length-1; i++)
                        {
                            System.out.print("" + palindrom[i] + ", ");
                        }
                        System.out.print("" + palindrom[palindrom.length-1] + "}");
                        System.out.println("");
                        // opakování cyklu
                        System.out.println("Chcete pokračovat? 0 - ne, jinak ano");
                        cont = sc.nextInt();
                    }
                }
                
                public static int[] createPalindrom(int[] pole)
                {
                    int[] palindrom = new int[(2*pole.length)-1];
                    for(int i = 0; i < pole.length; i++)
                    {
                        palindrom[i] = pole[i];
                        palindrom[(2*pole.length)-1-1-i] = pole[i];
                    }
                    return palindrom;
                }
}
