package Vostinak;

public class Methods {
    //testovaci main
    public static void main(String[] args) {
        int[] pole = {1, 2, 3, 4, 5};
        int[] palindrom = createPalindrom(pole);
        for(int i = 0; i < palindrom.length; i++){
            System.out.println(palindrom[i]);
        }
        int[][] matice = {{1, 2, 1},
                          {0, 1, 0},
                          {1, 2, 1}};
        System.out.println(arePositiveAndSumDiagonalsSame(matice));
    }
    
    public static int[] createPalindrom(int[] pole){
        int[] palindrom = new int[(pole.length*2)-1];
        for(int i = 0; i < pole.length; i++){
            palindrom[i] = pole[i];
        }
        int pocet = 1;
        for(int i = pole.length; i < palindrom.length; i++){
            palindrom[i] = pole[pole.length-1-pocet];
            pocet++;
        }
        return palindrom;
    }
    
    public static boolean arePositiveAndSumDiagonalsSame(int[][] matice) {
        int soucetDiagonaly = 0, soucetVedDiagonaly = 0;
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j < matice[i].length; j++){
                if(matice[i][j] < 0){
                    return false;
                }
                if(i == j){ //JV lepsi by bylo testovat to mimo vnitrni for += matice[i][i]
                    soucetDiagonaly += matice[i][j];
                }
                if(matice.length-1-i == matice.length-1-j){ //JV += matice[i][matice.length - 1 - i]
                    soucetVedDiagonaly += matice[i][matice.length-1-j];
                }
            }
        }
        if(soucetDiagonaly != soucetVedDiagonaly){
            return false;
        }
        return true;
    }
}
