
package Springl;
import java.util.Locale;
import java.util.Scanner;

public class AppMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velikost = sc.nextInt();
        int a[][] = new int[velikost][velikost];
        for (int i = 0; i < a[0].length; i++) {
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = sc.nextInt();
        }
        }
        for (int i = 0; i < a[0].length; i++) {
            for(int j = 0; j < a[0].length; j++){
                System.out.println(a[i][j]);
        }
        }
        if(Methods.arePositiveAndSumdiagonalsSame(a)){
            System.out.println("Matice splnuje podminku");
        }
        else{System.out.println("Matice nesplnuje podminku");}
       
    }
}
