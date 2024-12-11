/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.tucek;

import java.util.Scanner;
/**
 *
 * @author Tucek-J-04b4
 */
public class Marathon {
    public Bezec fastestBezec = new Bezec();
    public int bezcuUnderTime;
    public Bezec slowestBezec  = new Bezec();
    public Bezec slowestBezecSecond  = new Bezec();
    public int pocetBezcu = 1;
    
    public void Run(){
        Scanner sc = new Scanner(System.in);
        while(pocetBezcu > 0){
            System.out.println("Zadej pocet bezcu");
            pocetBezcu = sc.nextInt();
            if (pocetBezcu > 0) {
                for (int i = 1; i <= pocetBezcu; i++) {
                    Bezec bezec = new Bezec();
                    System.out.println("Zadej cislo bezce " + i);
                    bezec.cisloBezce = sc.nextInt();
                    System.out.println("Zadej cas v cily bezce " + i + " (hodiny minuty sekundy) ");
                    bezec.casHodiny = sc.nextDouble();
                    bezec.casMinuty = sc.nextDouble();
                    bezec.casSekundy = sc.nextDouble();
                    GetFastestRunner(bezec);
                    CheckIfUnderTime(bezec);
                    GetSlowestRunner(bezec);
                }
                double av = GetAverageSpeedOfFastestRunner();
                System.out.println( bezcuUnderTime + " bezci bezeli pod 2:07");
                System.out.println("Nejpomalejsi bezci byli " + slowestBezec.cisloBezce + ", " + slowestBezecSecond.cisloBezce + ".");
                System.out.println("Prumerna rychlost nejrychlejsiho bezce byla " + av + " km/h.");
            }
        }
    }
    
    public double GetAverageSpeedOfFastestRunner(){
        fastestBezec.casHodiny = fastestBezec.casHodiny -9;
        fastestBezec.casMinuty = fastestBezec.casMinuty -15;
        if(fastestBezec.casMinuty - 15 < 0){
            fastestBezec.casMinuty = fastestBezec.casMinuty + 60 - 15;
            fastestBezec.casHodiny = fastestBezec.casHodiny -1;
        }
        else{
            fastestBezec.casMinuty = fastestBezec.casMinuty - 15;
        }
        double hodina = fastestBezec.casHodiny + (fastestBezec.casMinuty / 60) + (fastestBezec.casSekundy / 3600.0);  //toto je spatne :(
        double av = 42195/hodina;
        return av;
    }
    
    public void GetSlowestRunner(Bezec bezec){
        if (bezec.casHodiny > slowestBezec.casHodiny) { 
            slowestBezecSecond = slowestBezec;
            slowestBezec = bezec;
            return;
        }
        else if (bezec.casHodiny == slowestBezec.casHodiny) {
            if (bezec.casMinuty > slowestBezec.casMinuty) {
                slowestBezecSecond = slowestBezec;
                slowestBezec = bezec;
                return;
            }
            else if (bezec.casMinuty == slowestBezec.casMinuty) {
                if (bezec.casSekundy >= slowestBezec.casSekundy) {
                    slowestBezecSecond = slowestBezec;
                    slowestBezec = bezec;
                    return;
                }
            }
        }
        
        if (bezec.casHodiny > slowestBezecSecond.casHodiny) { 
            slowestBezec = bezec;
            return;
        }
        else if (bezec.casHodiny == slowestBezecSecond.casHodiny) {
            if (bezec.casMinuty > slowestBezecSecond.casMinuty) {
                slowestBezecSecond = bezec;
                return;
            }
            else if (bezec.casMinuty == slowestBezecSecond.casMinuty) {
                if (bezec.casSekundy >= slowestBezecSecond.casSekundy) {
                    slowestBezecSecond = bezec;
                    return;
                }
            }
        }

    }
    
    public void CheckIfUnderTime(Bezec bezec){
        if(fastestBezec.casMinuty - 15 < 0){
            if (bezec.casHodiny - 9 <= 2 && bezec.casMinuty + 60 - 15 <= 7) {
                bezcuUnderTime ++;
            }
        }
        else{
            if (bezec.casHodiny - 9 <= 2 && bezec.casMinuty - 15 <= 7) {
                bezcuUnderTime ++;
            }

        }
    }
    
    public void GetFastestRunner(Bezec bezec){
        if (bezec.casHodiny < fastestBezec.casHodiny) { 
            fastestBezec = bezec;
            return;
        }
        else if (bezec.casHodiny == fastestBezec.casHodiny) {
            if (bezec.casMinuty < fastestBezec.casMinuty) {
                fastestBezec = bezec;
                return;
            }
            else if (bezec.casMinuty == fastestBezec.casMinuty) {
                if (bezec.casSekundy <= fastestBezec.casSekundy) {
                    fastestBezec = bezec;
                    return;
                }
            }
        }
        
    }
}
