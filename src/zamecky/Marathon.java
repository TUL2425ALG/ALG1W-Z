package zamecky;

import java.util.Scanner;

public class Marathon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cisloBezce = 0, cilHodiny = 0, cilMinuty = 0, cilSekundy = 0;
        int bezci = 0;
        final int DELKATRATI = 42195;
        final int STARTHODINY = 9;
        final int STARTMINUTY = 15;
        final int POTREBNYHODINY = 2;
        final int POTREBNYMINUTY = 7;

        do {
            System.out.println("Zadej počet běžců: ");
            bezci = sc.nextInt();
            System.out.println("Zadej jejich čísla a čas v cíli (jako počet hodin, minut a sekund, pro ukončení zadej číslo běžce záporně): ");
            int vysledekHodiny = 0, vysledekMinuty = 0;
            int pocetbezcu = 0;
            int prumer = 0;
            int pomalycas1 = 0, pomalycas2 = 0;
            double rychlycas = Double.MAX_VALUE;
            for (int i = 1; i <= bezci; i++) {
                cisloBezce = sc.nextInt();
                cilHodiny = sc.nextInt();
                cilMinuty = sc.nextInt();
                cilSekundy = sc.nextInt();

                int vysledekCas = cilHodiny * 3600 + cilMinuty * 60 + cilSekundy;

                if (vysledekCas < 7677) {
                    pocetbezcu++;
                }
                if (vysledekCas > pomalycas1) {
                    pomalycas2 = pomalycas1;
                    pomalycas1 = vysledekCas;
                } else if (vysledekCas > pomalycas2) {
                    pomalycas2 = vysledekCas;
                }

                double hodiny = vysledekCas / 3600;
                if (hodiny < rychlycas) {
                    rychlycas = hodiny;
                }

            }
            // process
            double nejrychlejsiRychlost = DELKATRATI / rychlycas;
            
            System.out.println(pocetbezcu + " běžci běžely pod tento čas");
        } while (bezci != 0);

    }

}
