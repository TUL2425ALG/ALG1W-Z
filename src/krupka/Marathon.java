/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package krupka;

import java.util.Scanner;

/**
 *
 * @author Krupka-M-4d24
 */
public class Marathon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadje pocet bezcu");
        int pocet_bezcu = sc.nextInt();
        while (pocet_bezcu != 0) {
            int puvodni_cas = 9 * 360 + 15 * 60; //Start v 9:15
            double delka_trati = 42.195;
            int rychly_bezci = 0;
            int nejpomalejsi_cas1 = 0;
            int nejpomalejsi_bezec1 = 0;
            int nejpomalejsi_cas2 = 1;
            int nejpomalejsi_bezec2 = 0;
            int nejrychlejsi_cas = nejpomalejsi_cas1;
            double rychlost = 0;
            for (int i = 0; i < pocet_bezcu; i++) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Zadej cislo bezce a jeho cas");
                int cislo_bezce = sc.nextInt();
                int hodina = sc.nextInt();
                int minuta = sc.nextInt();
                int sekunda = sc.nextInt();

                int cas = hodina * 360 + minuta * 60 + sekunda;

                if (cas - puvodni_cas <= 1140) { //2*360 + 7 * 60
                   rychly_bezci++;
                }
                if (cas >= nejpomalejsi_cas1) {
                    nejpomalejsi_cas2 = nejpomalejsi_cas1;
                    nejpomalejsi_cas1 = cas;
                    
                    nejpomalejsi_bezec2 = nejpomalejsi_bezec1;
                    nejpomalejsi_bezec1 = cislo_bezce;
                }
                
                if(cas < nejrychlejsi_cas){
                    nejrychlejsi_cas = cas;
                }
            }
            rychlost = ((delka_trati * 1000)/(nejrychlejsi_cas - puvodni_cas)) * 3.6; 
        
        }
    }
}
