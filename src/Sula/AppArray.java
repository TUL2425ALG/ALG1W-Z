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
public class AppArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true){
            System.out.println("");
            String response;
            System.out.println("Chcete pokracovat? A/N");
            response = sc.nextLine();
            if (response.equals("A")){
                System.out.println("Zadejte pole cisel. Kazde cislo oddelte mezerou. Příklad: 1 2 3");
                String poleNerozdelene = sc.nextLine();
                String[] PoleRozdelene = poleNerozdelene.split(" ");
                int[] pole = new int[PoleRozdelene.length];
                for (int i = 0; i<pole.length; i++){
                    pole[i] = Integer.parseInt(PoleRozdelene[i]);
                }
                for (int i = 0; i<pole.length; i++){
                    System.out.println(pole[i]);
                }

                int[] PalindromPole = Sula.Methods.createPalindrom(pole);
                System.out.print("{");
                for (int j = 0; j<PalindromPole.length; j++){
                    System.out.print(PalindromPole[j]);
                    if (j <PalindromPole.length-1){
                    System.out.print(", ");
                    }
                }
                System.out.print("}");
            }
            if (response.equals("N")){
                break;
            }
            
            
            
        }
 
        
        
    }
}
