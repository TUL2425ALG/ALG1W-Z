
package soupal;

import java.util.Scanner;
/**
 *
 * @author Soupal-J-446d
 */
public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int START_HOUR=9;
        int START_MINUTE=15;
        int LENGTH_TRASA=42195;
        
        
        int goodRunners = 0;
        int slowest = 0;
        int startTimeH = START_HOUR + (START_MINUTE/60);
        int hDif =0;
        int sDif =0;
        
        //opakovaci cyklus pro menu
        System.out.println("Zadej pocet bezcu: ");
        int n = sc.nextInt();
        
        //n zavodniku, 4 - znamena cisBez hodina minuta sekunda
        int[][] times = new int[n][4]; 
        int[] slowRun = new int[n];
        
        
        
        System.out.println("Zadej jejich cisla a cas v cili (jako pocet hodin,minut a sekund");
        for (int i=0; i<n; i++){
            for (int j=0; j<4; j++){
                times[i][j] = sc.nextInt();
            }
        }
        
        for (int i=0; i<n; i++){
            hDif = times[i][1]-START_HOUR;
            sDif = times[i][2]-START_MINUTE;
            if ((hDif<=2)&&(sDif<7))
                goodRunners++;
        }
        
        
        
//        for (int i=0; i<n; i++){
//            for (int j=0; j<4; j++){
//                if ((times[i][1]<times[i+1][1])&&(times[i][2]<times[i+1][2])&&(times[i][3]<times[i+1][3])){
//                    slowest = times[i][0];
//                }
//            }
//        }
        
        
        
        System.out.println(goodRunners + " zabehli cas pod 2:07");
//        System.out.println("Nejpomalejsi bezec byl: " + slowest);
        System.out.println("Prumerna rychlost nejrychlejsiho bezce je: ");
            
        
        
        
    }
    //metody se kterymi jsem chtel pracovat mi spise rozbijely program, nez aby mi pomahali, kdybych mel vice casu tak je pouziji
    //uz jsou hotove a staci je jen implementovat
//    public static int[][] runnerLoad(int times[][],int n){
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Zadej jejich cisla a cas v cili (jako pocet hodin,minut a sekund");
//
//        for (int i=0; i<n; i++){
//            for (int j=0; j<4; j++){
//                times[i][j] = sc.nextInt();
//            }
//        }
//        
//    return times;
//    }
    
//    public static int goodTime(int times[][], int n){
//        int hDif =0;
//        int sDif =0;
//        int goodRunners = 0;
////        for (int i=0; i<n; i++){
//            hDif = times[i][1]-START_HOUR;
//            sDif = times[i][2]-START_MINUTE;
//            if ((hDif<=2)&&(sDif<7))
//                goodRunners++;
//        }
//        return goodRunners;
//    }
//      public static int[] slowestRunners(int times[][], int n){
//        int slowest;
//        
//          
//        for (int i=0; i<n; i++){
//            for (int j=0; j<4; j++){
//                if ((times[i][1]<times[i+1][1])&&(times[i][2]<times[i+1][2])&&(times[i][3]<times[i+1][3]))
//                    slowest = times[i][0];
//            }
//        }
//      }
//    public static int quickRunner(int times[][], int n){
//        int quick=0;
//        int qRunnerTimeH = 0;
//        
//        for (int i=0; i<n; i++){
//            for (int j=0; j<4; j++){
//                if ((times[i][1]>times[i+1][1])&&(times[i][2]>times[i+1][2])&&(times[i][3]>times[i+1][3]))
//                   //dopocitat cas, prevest minuty na hodiny a sekundy na hodiny a vydelit
//                      int quick=times[i][0];
//                }
//            }
//        }
//    return quick;
//    }
}
