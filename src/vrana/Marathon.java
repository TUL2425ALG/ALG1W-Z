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
public class Marathon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            // in
            System.out.println("Zadej počet běžců.");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            final double delka = 42195;
            final int starthod = 9;
            final int startmin = 15;
            final int dvesedm = (2 * 3600 + 7 * 60);
            int[] cislo = new int[n];
            int[] hod = new int[n];
            int[] min = new int[n];
            int[] sek = new int[n];
            int[] cas = new int[n];
            int[] poradi = new int[n];
            int nejrychlejsi = 0;
            double nejrychlost;
            int nejpomalejsi = 0;
            int nej2pomalejsi = 0;
            int pod207 = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Zadej číslo " + (i + 1) + ". běžce.");
                cislo[i] = sc.nextInt();
                System.out.println("Zadej hodiny " + (i + 1) + ". běžec dorazil do cíle.");
                hod[i] = sc.nextInt();
                // TODO Kontrol jestli nepřiběhl <9 -- NEKONTROLUJEME VSTUP
                System.out.println("Zadej minuty " + (i + 1) + ". běžec dorazil do cíle.");
                min[i] = sc.nextInt();
                System.out.println("Zadej sekundy " + (i + 1) + ". běžec dorazil do cíle.");
                sek[i] = sc.nextInt();
                //processing
                cas[i] = (hod[i] * 3600 + min[i] * 60 + sek[i]) - (starthod * 3600 + startmin * 60); //JV vypocitat si start v sekundach dopredu, nepocitat to znova v kazdem kroku 
                if (cas[i] < dvesedm) {
                    pod207++;
                }
            }
            for (int i = 0; i < n; i++) // processing
            {
                if (cas[i] < cas[nejrychlejsi]) {
                    nejrychlejsi = i;
                } else {
                    if (cas[i] > cas[nejpomalejsi]) {
                        nejpomalejsi = i;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (cas[i] < cas[nejpomalejsi] && cas[i] > cas[nej2pomalejsi]) {
                    nej2pomalejsi = i;
                }
            }
            nejrychlost = (delka / cas[nejrychlejsi]) * 3.6; // m/s * 3.6 = km/h
            System.out.println("" + pod207 + " běžců běželo pod 2:07."); // out
            System.out.println("Nejpomalejsi byli " + cislo[nejpomalejsi] + ", " + cislo[nej2pomalejsi]);
            System.out.println("Průměrná rychlost nejrychlejšího běžce byla " + nejrychlost + " km/h."); // nevzpomenu si jak se zaokrouhluje
        }
    }
}
