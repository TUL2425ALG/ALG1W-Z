package Dubinin;
import java.util.Scanner;
/**
 *
 * @author Dubinin-V-0259
 */
public class Marathon {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        final int startCasHod = 9;
        final int startCasMin = 15;
        final int startCasSec = 0;
        int nejpomalejsiCas = 0;
        final double distance = 42.195;
        System.out.println("zadej pocet bezcu: ");
        int pocetBezcu = sc.nextInt();
        int pocetBezcuPod = 0;
        
        if(pocetBezcu == 0){
            System.out.println("Program je ukoncen");
        }
        else{
            System.out.println("zadej jejich cisla cas v cili ");
            for (int i = 0; i < pocetBezcu; i++) {
        int cisloBezcu = sc.nextInt();
        int casHod = sc.nextInt();
        int casMin = sc.nextInt();
        int casSec = sc.nextInt();
        int casTotal = casHod*3600 + casMin*60 + casSec;
        
        if( casTotal < 7620){
            pocetBezcuPod = pocetBezcuPod+1;
                
            }
            }
            System.out.println(pocetBezcuPod + " beczi bezelo pod 2:07");
        
            
        }
    }
    
}
