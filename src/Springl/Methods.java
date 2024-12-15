package Springl;

public class Methods {

    public static void main(String[] args) {
    }

    public static boolean arePositiveAndSumdiagonalsSame(int a[][]) {
        int soucetDiagonaly = 0;
        int soucetAntiDiagonaly = 0;

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] <= 0) {
                    return false;
                }
                if (i == j) {
                    soucetDiagonaly = soucetDiagonaly + a[i][j];
                }
                if (j == a[0].length - i) {
                    soucetAntiDiagonaly = soucetAntiDiagonaly + a[i][j];
                }

            }
           
        }
        if (soucetDiagonaly == soucetAntiDiagonaly) {
            return true;
        } else {
            return false;
        }

    }
    public static int[] createPalindrom(int n[]){
        int palindrom[] = new int[2*n.length-1];
        for(int i =0; i<palindrom.length; i++){
            if(i<n.length){
                palindrom[i] = n[i];}
            else{
                palindrom[i]= n[palindrom.length-1-i];
        }
        }
        return palindrom;
}
}
