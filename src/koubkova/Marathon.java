/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koubkova;

import java.util.Scanner;
// 5 1 11 16 39 2 11 21 48 4 11 21 23 12 11 23 46 13 11 23 16

public class Marathon {

    public static void main(String[] args) {
        final int pocetCasu = 3;
        final int zacatek = 9 * 60 * 60 + 15 * 60;
        final int trat = 42195;
        final int rekord = 2 * 60 * 60 + 7 * 60;
        Scanner sc = new Scanner(System.in);
        boolean konec = false;
        while (!konec) {
            System.out.println("Zadej počet běžců: ");
            int pocetBezcu = sc.nextInt();
            if (pocetBezcu == 0) {
                konec = true;
                break;

            }
            System.out.println("Zadej jejich čísla a čas v cíli (jako počet hodin, minut a sekund):");
            int pocetRekordmanu = 0;
            int nejpomalejsiCas1 = 0;
            int nejpomalejsiCas2 = 0;
            int nejrychlejsiBezec = 0;
            double prumernaRychlost = 0;
            int k = 0;
            do {
                int cisloBezce = sc.nextInt();
                int hodiny = sc.nextInt();
                int minuty = sc.nextInt();
                int sekundy = sc.nextInt();
                int cas = hodiny * 60 * 60 + minuty * 60 + sekundy;
                if (cas - zacatek < rekord) { //JV je dobre si rozdil cas - zacatek ulozit do promenne, abyste ho dal v kodu nemusela znovu pocitat
                    pocetRekordmanu = pocetRekordmanu + 1;
                }

                if (cas - zacatek >= nejpomalejsiCas1) {
                    nejpomalejsiCas2 = nejpomalejsiCas1;
                    nejpomalejsiCas1 = cisloBezce; //JV trochu mi nedava smysl, proc do casu ukladate cislo bezce
                }
                if (cas - zacatek >= nejpomalejsiCas2 && nejpomalejsiCas1 != cisloBezce) {
                    nejpomalejsiCas2 = cisloBezce;
                }
                if (nejrychlejsiBezec == 0) { //JV netestovat v cyklu je to prvni prvek, je to prvni prvek - hledani minima nastavit pred cyklem: nejrychlejsiBezec = Double.MAX_VALUE, pak ho první bezec urcite prenastavi
                    nejrychlejsiBezec = cas - zacatek;
                }
                if (cas - zacatek < nejrychlejsiBezec) {
                    nejrychlejsiBezec = cas - zacatek;
                    prumernaRychlost = trat / (cas - zacatek) * 3.6; //JV dát az za do-while - neni potreba pocitat pri nacitani kazdého dalsiho bezce
                                                                     //JV prumernaRychlost = trat / nejrychlejsi * 3.6
                }
                k = k + 1;

            } while (k < pocetBezcu);
            System.out.println(pocetRekordmanu + " běžci běželi pod 2:07.");
            System.out.println("Nejpomalejší běžci byli " + nejpomalejsiCas1 + ", " + nejpomalejsiCas2);
            System.out.println("Průměrná rychlost nejrychlejšího běžce byla " + prumernaRychlost);

        }
    }
}
