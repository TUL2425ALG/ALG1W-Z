/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turecek;

import java.util.Scanner;

public class Mararthon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        final int STARTTIME = 9 * 60 * 60 + 15 * 60;
        final double DISTANCE = 42.195;
        final int MEZ = 2 * 3600 + 7 * 60;
        int rychly = 0;
        final int MIN = 0;
        int porov = 0;
        int nejpom = 1;
        int snejpom = 0;
        int nejrych;
        int cislo = 0;
        int hodin = 0;
        int minut = 0;
        int sekund = 0;
        int temp = 0;

        do {
            System.out.println("Zadejte pocet bezcu:");
            int pocet = sc.nextInt();
            if (pocet == 0) {
                end = true;
                break;
            }
            for (int i = 0; i < pocet; i++) {
                System.out.println("Zadej cislo bezce: ");
                 cislo = sc.nextInt();
                
                System.out.println("zadej cas dobehu: ");
                System.out.println("hodin: ");
                 hodin = sc.nextInt();
                System.out.println("minut: ");
                 minut = sc.nextInt();
                System.out.println("sekund: ");
                 sekund = sc.nextInt();
                int cas = hoursSeconds(hodin, minut, sekund) - STARTTIME;
                if (cas < MEZ) {
                    rychly = rychly + 1;
                }
                if(i == 1){
                     porov = cas;
                     nejpom = cislo;
                     nejrych = cislo;
                }
                if(cas > porov){
                     nejpom = cislo;
                     if(i == pocet -1){
                         snejpom = temp;
                     }
                     temp = nejpom;
                }else if(porov < cas && cas < nejpom){
                     snejpom = cislo;
                }
                if(cas<porov){
                    nejrych = cislo;
                    double nejrychprum = cas/DISTANCE;
                }

            }
            
            System.out.println("Pocet běžců pod 2:07: " + rychly);
            System.out.println("nejpomalejší: " + nejpom + ", "+ snejpom);
            
            
        } while (!end);

    }

    public static int hoursSeconds(int hodin, int minut, int sekund) {
        int cas = hodin * 3600 + minut * 60 + sekund;
        return cas;
    }

}
