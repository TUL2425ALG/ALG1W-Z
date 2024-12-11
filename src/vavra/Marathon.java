/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vavra;
import java.util.Scanner;
/**
 *
 * @author Vavra-V-e4e5
 */
public class Marathon {
    public static int toSec(int h, int min, int sec) { //time in secs
        return h*3600 + min*60 + sec;
    }
    
    public static int[] createPermutation(int[] ar){ //sorting
    int[] ar_clone = new int[ar.length];
    int[] perm = new int[ar.length];
    for(int i = 0; i < ar.length; i++){
    ar_clone[i] = ar[i];
    perm[i] = i;
    }
    for(int i = 0; i < ar_clone.length -1; i++){
    for(int j = 0; j < ar_clone.length -1; j++){
        if(ar_clone[j] >= ar_clone[j+1]){
            int temp = ar_clone[j];
            ar_clone[j] = ar_clone[j+1];
            ar_clone[j+1] = temp;
            temp = perm[j];
            perm[j] = perm[j+1];
            perm[j+1] = temp;
        }
    }
    }
    return perm;
    }
    
    public static int[] sort(int[] sort, int[] perm) { //sort using perm
        int[] sorted = new int[perm.length];
        for(int i = 0; i < perm.length; i++){
            sorted[i] = sort[perm[i]];
        }
        return sorted;
    }
    
    public static void printNumUnder2_07(int[] sorted_time_in_seconds) { //print1
        int count = 0;
        for(int i = 0; i < sorted_time_in_seconds.length; i++){
            if(sorted_time_in_seconds[i] < toSec(2,7,0)){
                count = count + 1;
            }
        }
        System.out.println(count + " běžci běželi pod 2:07");
    }
    
    public static void printLastTwo(int[] sorted_nums) { //print2
        System.out.println("Nejpomalejši bězci byli: "+sorted_nums[sorted_nums.length-2]+" a "+sorted_nums[sorted_nums.length-1]);
    }
    
    public static void printAverageMaxSpeed(int[] sorted_time_in_seconds, float len) { //print3
        int time = sorted_time_in_seconds[0];
        float speed = len/time*3600; //km/s -> km/h
        speed = speed*100;
        speed = (float)Math.floor(speed);
        speed = speed/100;
        System.out.println("Průměrná rychlost nejrychlejšiho bězce byla "+speed+"km/h");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        while(cond){
            System.out.println("Zadej pocet běžců: ");
            int n_runners = sc.nextInt();
            if(n_runners < 1){
                break;
            }
            int[] nums = new int[n_runners];
            int[] time_in_seconds = new int[n_runners];
            //9:15 start, 42.195 km
            final int start_sec = toSec(9,15,0);
            final float track_len = 42.195f;
            System.out.println("Zadej jejich čisla a čas v cíli (jako počet hodin, minut a sekund)");
            for (int i = 0; i < n_runners; i++){
            nums[i] = sc.nextInt();
            int h = sc.nextInt();
            int min = sc.nextInt();
            int sec = sc.nextInt();
            time_in_seconds[i] = toSec(h,min,sec) - start_sec;
            }
            //Methods.printAr(nums);
            int[] perm = createPermutation(time_in_seconds);
            int[] sorted_time_in_seconds = sort(time_in_seconds, perm);
            int[] sorted_nums = sort(nums, perm);
            //Methods.printAr(sorted_time_in_seconds);
            //Methods.printAr(sorted_nums);
            printNumUnder2_07(sorted_time_in_seconds);
            printLastTwo(sorted_nums);
            printAverageMaxSpeed(sorted_time_in_seconds, track_len);
        }
        //Methods.printAr(perm);
        //Methods.printAr(nums);
        //Methods.printAr(sort(nums, perm ));
        //setridit
        //2 cisla nejpomalejsich
        //kolik pod 2:07
        //prum rychlost nejrychlejsiho na 2 des
    }
}
