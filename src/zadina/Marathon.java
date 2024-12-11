
package zadina;

import java.util.Scanner;


public class Marathon {
     static Scanner sc = new Scanner(System.in);
    // 5 1 11 16 39 2 11 21 48 4 11 21 23 12 11 23 46 13 11 23 16
    // 
    
    // startovní čas je 9:15(hodiny, minuty) a já si ho dám na sekundy
        final static int STARTOVNI_CAS = 9*3600+15*60;
        
    // délka závodu je 42.195 km a já si to uložím v metrech
        final static int DELKA_ZAVODU = 42195;
        
        final static int SLEDOVANY_CAS = 2*3600 + 7*60;
        
    public static void main(String[] args) {
       
        
        System.out.println("Zadej počet běžců: ");
        System.out.println("Pro ukončení programu zadej 0");
        int pocetBezcu = nacistPocetBezcu();
        
        while(pocetBezcu != 0){
        
        // Pro uchovani dat si udelam dve pole, do prvniho ukladam startovni cisla a do druheho cas v cili
        // Jednotlive indexy obou polí jsou na sobě závislé, takže nultý index z prvního pole patří k nultému indexu z druhého pole
        
        
        // první databáze klasická čísla
        int[] databazeCisel = new int[pocetBezcu];
        
        // druhá databáze, tady zapíšu v sekundách, ať nemusím řešit více hodnot
        int[] databazeCasu = new int[pocetBezcu];
        
         for (int i = 1; i <= pocetBezcu; i++) {
            
            System.out.println("Zadej startovní číslo bězce: ");
            databazeCisel[i-1] = sc.nextInt();
            
            System.out.println("Teď budeš zadávat jeho čas doběhu(hodiny, minuty, sekundy): ");
            
            System.out.println("Zadej hodiny: ");
            int hodiny = sc.nextInt();
            
            System.out.println("Zadej minuty: ");
            int minuty = sc.nextInt();
            
            System.out.println("Zadej sekundy: ");
            int sekundy = sc.nextInt();
            
            int casNaSekundy = (hodiny*3600 + minuty*60 + sekundy)-STARTOVNI_CAS;
                
            databazeCasu[i-1] = casNaSekundy;
            
        }
         System.out.println("-------------------");
            System.out.println("Seznam běžců:");
        vypsatBezce(pocetBezcu, databazeCisel, databazeCasu);
            System.out.println("-------------");
        System.out.println("Seznam běžců, kteří běželi závod pod 2:07");
            for (int i = 0; i < databazeCasu.length; i++) {
                
                if(databazeCasu[i] < SLEDOVANY_CAS){
                   
                    System.out.print(databazeCisel[i] + " --- " + databazeCasu[i] + "s");
                     System.out.println("");
                }
                
            }
            System.out.println("");
            System.out.println("-------------------");
            
            System.out.println("Hledání dvou nejpomalejších: ");
            
            int prvniPomaly = 0;
            int prvniPomalyCas = 0;
            
            int druhyPomaly = 0;
            int druhyPomalyCas = 0;
            for (int i = 0; i < databazeCisel.length; i++) {
                
                
                if(databazeCasu[i] > prvniPomalyCas){
                    druhyPomalyCas = prvniPomalyCas;
                    druhyPomaly = prvniPomaly;
                    
                    prvniPomalyCas = databazeCasu[i];
                    prvniPomaly = databazeCisel[i];
                }else if(databazeCasu[i] < prvniPomalyCas && databazeCasu[i] > druhyPomalyCas){
                    druhyPomalyCas = databazeCasu[i];
                    druhyPomaly = databazeCisel[i];
                }
                
            }
            System.out.println("Dva nejpomalejší běžci jsou: ");
            System.out.println(prvniPomaly + " --- " + prvniPomalyCas + "s");
            System.out.println(druhyPomaly + " --- " + druhyPomalyCas + "s");
            
            float nejrychlejsiCas = databazeCasu[0];
            float nejrychlejsiCislo = databazeCisel[0];
            float prumerna = 0;
            for (int i = 0; i < databazeCasu.length; i++) {
                
                if(databazeCasu[i] < nejrychlejsiCas){
                nejrychlejsiCas = databazeCasu[i];
                nejrychlejsiCislo = databazeCisel[i];
                }
                
            }
            prumerna = (DELKA_ZAVODU/1000)/(nejrychlejsiCas/3600);

            System.out.println("Průměrná rychlost nejrychlejšího běžce byla: " + prumerna + " km/h");

        }
        System.out.println("Ukončuji program.");
    }
    public static int nacistPocetBezcu(){
        int pocetBezcu = sc.nextInt();
        
        return pocetBezcu;
    }
    
    public static void vypsatBezce(int pocetBezcu, int[] databazeCisel, int[] databazeCasu){
        for (int i = 0; i < pocetBezcu; i++) {
            

            System.out.println(databazeCisel[i] + " --- "  + databazeCasu[i] + "s");
            
        }
    }

   
}
