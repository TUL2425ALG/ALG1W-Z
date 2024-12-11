
package Tkachov;

import java.util.Scanner;


public class Marathon {
    
    public static final double DISTANCE = 42.195;
    public static final int START_MINULE = 15;
    public static final int START_HOUR = 9;
    public static final int START_SEKUND = 0;
                    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true){
            System.out.println("Zadej pocet bezcu: ");
            
            int runners = sc.nextInt();
            
            if(runners == 0){
                    break;
            }
            
           
            int countNumber207 = 0;
            int slowestHours = 0;
            int slowersMinute = 0;
            int slowersSecund = 0;
            double slowestSpeed = Double.MAX_VALUE;
            
            
                for (int i = 1; i <= runners; i++) {

                    System.out.println("\n Zadej cas bezcu (" + i + ")  hodiny minuty secundy");
                    int hours = sc.nextInt();
                    int minuts = sc.nextInt();
                    int secunds = sc.nextInt();


                    int totalTimeInSec = (hours - START_HOUR)*3600 + (minuts - START_MINULE)*60  + secunds;

                    int totalTimeInHours = totalTimeInSec / 3600;
                    double speed = DISTANCE / totalTimeInHours;


                    if(totalTimeInHours < 2 + 7*60){
                        countNumber207++;
                    }

                    if(speed < slowestSpeed){
                        slowestSpeed = speed; 
                        slowestHours = hours;
                        slowersMinute = minuts;
                        slowersSecund = secunds;
                    }


                    System.out.println(countNumber207 +"Bezelo pod 2:07");


                }
            
                if (slowestSpeed != Double.MAX_VALUE) {
                    System.out.println("Nejpomalejs rucly bezec bezel: " + slowestSpeed + " km/h.  "+" Cas-  "+slowestHours +":"+ slowersMinute+":"+ slowersSecund+ " .");
                    System.out.printf("Nejpomalejs rucly bezec bezel: %.2f", slowestSpeed);
                }        
                        
                          
        }
    }
    
}          
                    
            
            
                    
