package smidova;

import java.util.Scanner;

public class Marathon {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final double VYBEH = 9.15;
        final double TRASADELKA = 42.195;
        final int HOURS_TO_SECS = 3600;
        final int MINUTES_TO_SECS = 60;

        while (true) {

            System.out.println("Zadej pocet bezcu: ");
            int pocetBezcu = sc.nextInt();
            System.out.println("Zadej jejich cislo a cas v cili (hodiny  minuty  sekundy): ");

            for (int i = 0; i < pocetBezcu; i++) {
                int cisloBezce = sc.nextInt();
                int casBezceHodiny = sc.nextInt();
                int casBezceMinuty = sc.nextInt();
                int casBezceSekundy = sc.nextInt();
                int celkovyCas = casBezceHodiny * HOURS_TO_SECS + casBezceMinuty * MINUTES_TO_SECS + casBezceSekundy;

                System.out.println("Bezec cislo " + cisloBezce + "  " + casBezceHodiny + ":" + casBezceMinuty + "." + casBezceSekundy);
                double rychlost = TRASADELKA / celkovyCas; //JV chtelo to jeste odecist cas vybehu a prevest na km/h
                System.out.println("ma rychlost: " + rychlost);

                //JV dost toho chybi
                System.out.println("");

//                double max = 2.07;
//                double pom = 0;
//                if (rychlost < max) {
//
//                    System.out.println("Rychlost nejrychlejsiho bezce: " + rychlost);
                
                //dva nejpomalejsi: 
                int min = 10;
                if (rychlost < min) {
                    min = cisloBezce;

                    System.out.println("Nejpomalejsi bezec:" + cisloBezce);

                }
            }

            //prumer nejrychlejsiho 
//                if (rychlost < CAS) {
//                    System.out.println(cisloBezce);
            if (pocetBezcu == 0) {
                break;
            }

            System.out.println("");

        }
    }
}
