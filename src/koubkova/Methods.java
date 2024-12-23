package koubkova;

public class Methods {

    public static void main(String[] args) {
        int[][] matice = new int[4][4];

    }

    public static boolean arePositiveAndSumDiagonalsDame(int[][] matice) {
        boolean vysledek = true;
        for (int i = 0; i < matice.length; i++) {
            for (int j = 0; j < matice[i].length; j++) {
                if (matice[i].length != matice.length) {
                    vysledek = false; //JV idealne delat rovnou return false, aby se nic dalsiho netestovalo
                }
                if (matice[i][j] == 0) { //JV mela obsahovat jen kladna cisla
                    vysledek = false;
                }
                if (matice[i][i] != matice[matice.length - 1 - i][matice.length - 1 - i]) { //JV diagonaly nemusi mit stejná čisla, ale součet musi byt stejny treba 1 2 4 a 2 3 2 
                    vysledek = false;
                }
            }
        }
        return vysledek;
    }

    public static int[] createPalindom(int[] posloupnost) {
        int[] palindom = new int[(posloupnost.length * 2) - 1];
        for (int i = 0; i < posloupnost.length; i++) {
            palindom[i] = posloupnost[i];
            palindom[(palindom.length - 1) - i] = posloupnost [i];
        }
        return palindom;
    }

}
