/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tandler;
import java.util.Scanner;

/**
 *
 * @author Tandler-D-0f5f
 */
public class Marathon {
    public static void main(String[] args) {
        
        //Proměnné inicializovány zde abychom je neiniciovaly opakovaně
        Scanner sc = new Scanner(System.in);
        final int MARATHON_LENGTH = 42195; //(kms)
        int runner_count;
        int runner_number,hours,minutes,seconds,run_time;
        
        int slowest_time,slowest_number,second_slowest_time,second_slowest_number;
        int quick_runner_count,fastest_runner_time;
        float avg_speed_fastest;
        
        int end = 1;
        while(end != 0){
            //INPUTS    
        
            //reseting for next use
            slowest_time = 0; //min
            slowest_number = 0;
            second_slowest_time = 0; //2nd min
            second_slowest_number = 0;
            
            quick_runner_count = 0; //counter
            fastest_runner_time = 0; //max
            
            System.out.println("Zadej pocet bezcu");
            runner_count = sc.nextInt();
            for (int i = 0; i < runner_count; i++) {
            System.out.println("Zadej cislo bezce");
            runner_number = sc.nextInt();
            System.out.println("Zadej dobu behu jako pocet hodin, minut a sekund");
            hours = sc.nextInt();
            minutes = sc.nextInt();
            seconds = sc.nextInt();
        
        
            //PROCESSING
            run_time = hours*3600+minutes*60+seconds;
            
            if(run_time < 7620){ //7620 = 2:07
                quick_runner_count++;
            }
        
            if(run_time < slowest_time){
                second_slowest_time = slowest_time;
                second_slowest_number = slowest_number;
                slowest_time = run_time;
                slowest_number = runner_number;
            }
            else if((slowest_time < run_time) && (run_time > second_slowest_time) ){
                second_slowest_time = run_time; 
                second_slowest_number = runner_number;
            }
        
            if(run_time > fastest_runner_time){
                fastest_runner_time = run_time;
            }
            avg_speed_fastest = MARATHON_LENGTH/(fastest_runner_time / 3600);
        
            //OUTPUT
            System.out.printf("Pod 2:07 bezelo %d bezcu",quick_runner_count);
            System.out.printf("Nejpomalejsí bezci byli %d a %d",slowest_number,second_slowest_number);
            System.out.printf("Prumerna rychlost nejrychlejsiho bezce byla %f.2 km/h.",avg_speed_fastest);
            System.out.println("");
            System.out.println("Pro ukonceni programu zadejte 0, pro pokracovani jakekoliv jine cislo");
            end = sc.nextInt();
            }
        }
    }
}