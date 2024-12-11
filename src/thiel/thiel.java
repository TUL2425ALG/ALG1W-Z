/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thiel;
import java.io.InputStream;
import java.util.Scanner;
import jdk.swing.interop.DragSourceContextWrapper;

/**
 *
 * @author Thiel-P-ee65
 */
public class thiel {
    public static void main(String[] args) {
        while(true)
        {
        double start = 9*3600+15*60;
        double delka_trati = 49.195;
        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte počet běžců:");
        int pocet_bezcu = sc.nextInt();
        if(pocet_bezcu == 0)break;
        boolean pom = true; 
        int p = 0;
        int cislo_bezce = 0;
        double bezec_cas= 0;
        
        while(pom == true)
        {
            System.out.println("Zadejte číslo běžce:");
            cislo_bezce = sc.nextInt();
            System.out.println("Zadejte čas doběhu běžce " + cislo_bezce + " v hodinách:");
            int bezec_cas_h = sc.nextInt();
            System.out.println("Zadejte čas doběhu běžce " + cislo_bezce + " v minutách:");
            int bezec_cas_m = sc.nextInt();
            System.out.println("Zadejte čas doběhu běžce " + cislo_bezce + " v sekundách:");
            int bezec_cas_s = sc.nextInt();
            int bezec_casy = (bezec_cas_h * 3600 + bezec_cas_m * 60 + bezec_cas_s);
            bezec_cas = bezec_casy;
            
            p++;
            if(p == pocet_bezcu)pom = false;
            
        }
             prum_rychlost();
             
             
            
        
           
            
                
        }
        public static void prum_rychlost();
        {
           double prum_rychlost = (delka_trati/(bezec_cas/3600.00));
            System.out.println("průměrná rychlost běžce je: " + prum_rychlost%.2f + "km/h"); 
        }
        
        public static void nejpomalejsi()
        {
            //vytvoří z časů pole. porovná postupně po dvou čísla a najde nejpomalejšího. toho uloží do proměnné pomaly_1 a vymaže čas v matici a ještě jednou porovná čísla a uloží číslo s největší hodnotou do pomaly_2
        }
    }  
}

       
