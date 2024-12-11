/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Springl;
import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        System.out.println("Zadej pocet bezcu:");
        Scanner sc = new Scanner(System.in);
        int pocetBezcu = sc.nextInt();
        
        double vzdalenost = 42195;
        double start = 9*3600+15*60;
        for(int i = pocetBezcu; i>0;i--){
        System.out.println("Zadej cislo bezce:");
        if(pocetBezcu == 0){break;}
        int cisloBezce = sc.nextInt();
        int hodiny = sc.nextInt();
        int minuty = sc.nextInt();
        int sekundy = sc.nextInt();
        
        double cil = hodiny*3600+minuty*60+sekundy;
        double cas = cil-start;
        double rychlost = vzdalenost/cas*3.6;
        int chtenyCas = 2*3600+7*60;
        int pocetRychlychBezcu =0;
        }
        if(cas <= chtenyCas){
            pocetRychlychBezcu = pocetRychlychBezcu+1;
        }
        int nejrychlejsi = 0;
        if(rychlost > nejrychlejsi){
            rychlost = nejrychlejsi;
        }
        System.out.println(cisloBezce);
        System.out.println(start);
        System.out.println(cas);
        System.out.println(rychlost);
        System.out.println(pocetRychlychBezcu + " bezci bezeli pod 2:07" );
        System.out.println("Prumerna rychlost nejrychlejsiho bezce byla: "+ nejrychlejsi);
        
    }
}
