package Vostinak;

import java.util.Scanner;

public class Marathon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int START_CAS = 60 * 60 * 9 + 15 * 60;
        final int POD_CAS = 60 * 60 * 2 + 7 * 60;
        final double delkaTrate = 42.195;
        boolean pokracovani = true;

        //input
        while (pokracovani) {
            System.out.println("Zadej pocet bezcu (0 pro ukonceni programu): ");
            int pocet = sc.nextInt();
            
            if(pocet <= 0){
                System.out.println("Ukonceni programu");
                return;
            }

            int[] bezecCislo = new int[pocet];
            int[] bezecCas = new int[pocet];
            int bezecHodiny, bezecMinuty, bezecSekundy;
            System.out.println("Zadej jejich cislo a cas v cili (jako pocet hodin, minut a sekund): ");
            for (int i = 0; i < pocet; i++) {
                bezecCislo[i] = sc.nextInt();
                bezecHodiny = sc.nextInt();
                bezecMinuty = sc.nextInt();
                bezecSekundy = sc.nextInt();
                bezecCas[i] = (60 * 60 * bezecHodiny) + (60 * bezecMinuty) + bezecSekundy;
            }

            //processing
            int pocetPod = 0;
            int[] vypocitanyCas = new int[pocet];
            for (int i = 0; i < pocet; i++) {
                vypocitanyCas[i] = bezecCas[i] - START_CAS;
                if (vypocitanyCas[i] < POD_CAS) {
                    pocetPod++;
                }
            }

            int pomaly1 = 0, pomaly2 = 0, rychly = 0, maxVypocitany = Integer.MAX_VALUE;
            for (int i = 0; i < pocet; i++) {
                if (maxVypocitany > vypocitanyCas[i]) {
                    rychly = bezecCislo[i];
                    maxVypocitany = vypocitanyCas[i];
                }
                //JV na zjisteni nejpomalejsich casu staci jeden pruchod pole, neni potreba vnoreny for 
                for (int j = i + 1; j < pocet; j++) {
                    if (vypocitanyCas[i] > vypocitanyCas[j]) {
                        pomaly1 = bezecCislo[i];
                    } // druheho nejpomalejsiho bohuzel nevim
                }
            }
            System.out.println(rychly);
            
            double rychlost = delkaTrate / (vypocitanyCas[rychly] / 3600); //JV celociselne deleni dvou integru

            //output
            System.out.println(pocetPod + " bezci bezeli pod 2:07.");
            System.out.println("Nejpomalejsi bezci byli " + pomaly1 + " a " + pomaly2);
            System.out.printf("Prumerna rychlost nejrychlejsiho bezce (%d) byla %.2f km/h.", rychly, rychlost);
            System.out.println("");
        }
    }
}
