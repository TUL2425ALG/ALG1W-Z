/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sula;
import java.util.Scanner;

/**
 *
 * @author Sula-J-aac4
 */
public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocetBezcu;
        double vzdalenost = 42.195;
        int hodiny = 9;
        int minuty = 15;
        pocetBezcu = 1;
        int CelkovyZacatek = (hodiny*3600+minuty*60);
        
        
        while(true)
        {
            int countRychlych = 0;
            System.out.println("Zadej počet běžců");
            pocetBezcu = sc.nextInt();
            if(pocetBezcu<=0){
                break;
            }
            
            int[][] sportovci = new int[pocetBezcu][5]; /* Matice: Číslo, hodiny, minuty, sekundy, celkČas */
            System.out.println("Zadej jejich císla a cas v cíli (jako cislo, pocet hodin, minut a sekund)(hodnoty oddeluj mezernikem)");
            for (int i=0; i < pocetBezcu; i++){
                String sportNerozdelene = sc.nextLine();
                String[] sportRozdelene = sportNerozdelene.split(" ");
                for (int j=0; j < sportRozdelene.length; j++){
                    System.out.println(sportRozdelene[j]);
                    sportovci[i][j] = Integer.parseInt(sportRozdelene[i]); // Hází mi to interní error, ale reálně nevidím co je na tom špatně, v programu AppArray to funguje uplně krásně uplně stejně
                }
                }
                // Tudíž bych měl mít naplňěnou matici
                
                for (int i = 0; i < pocetBezcu; i++){ // Naplnění posledního řádku času
                    sportovci[i][4] = (sportovci[i][1]*3600+sportovci[i][2]*60+sportovci[i][3]);
                    if (sportovci[i][4]-CelkovyZacatek < 127){
                        countRychlych++;
                    }
                }
                
                int[] poradi =  new int[pocetBezcu];
                
                for (int i = 0; i< pocetBezcu-1; i++){
                    for (int j = 0; j<pocetBezcu-1; j++){
                        if (sportovci[i][4] > sportovci[i+1][4]){
                            int[] tempSport = sportovci[i+1];
                            sportovci[i+1] = sportovci[i];
                            sportovci[i] = tempSport;
                            
                            
                            poradi[i] = sportovci[i][0];
                        }
                    }
                }
                
                System.out.println(countRychlych + " běžci běželi pod 2:07");
                // nestíhl jsem vypsat
                
            }
        }
        
        
        
        

        
        
        
 }
