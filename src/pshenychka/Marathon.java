/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pshenychka;

import java.util.Scanner;

public class Marathon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pocet bezcu:");

        int CisloBezcu = scanner.nextInt();
        scanner.nexLine();

        String PosledniBezec = "";
        double rychlost2 = -1;

        for (int i = 1; i <= CisloBezcu; i++) {
            System.out.println("Cislo bezcu:");
            String jmeno = scanner.nextLine();

            System.out.println("Cas bezcu:");
            double cas = scanner.nexDouble();
            sanner.nextLine();

            if (rychlost2 < cas;)
            {
                rychlost2 = cas;
                PosledniBezec = jmeno;
            }

            System.out.println("Posledni bezec" + PosledniBezec);
            System.out.println("Jeho cas" + rychlost2 + "minut");
        }

    }

}
