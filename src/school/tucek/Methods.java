/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.tucek;
/**
 *
 * @author Tucek-J-04b4
 */
public class Methods {
    
    public int[][] fillEven(int rows, int cols){
        int nasobek = 3;
        int[][] matice = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matice[r][c] = nasobek;
                nasobek = nasobek *3;
            }
            
        }
        return matice;
    }
    
    public int[] createPalindrom(int[] zadanaCisla){
        int[] vysledek = new int[zadanaCisla.length - 1];
        for (int i = 0; i < zadanaCisla.length; i++) {
            vysledek[i] = zadanaCisla[i];
            vysledek[vysledek.length - i] = zadanaCisla[zadanaCisla.length - i];
        }
        return vysledek;
    }
    
    public boolean constantSumNextTwo(int[] zadanaCisla){
        int firstSum = zadanaCisla[0] + zadanaCisla[1];
        boolean isOk = false;
        for (int i = 0; i < zadanaCisla.length; i = i+2) {
            if(zadanaCisla[i] + zadanaCisla[i+1] == firstSum ){
                isOk = true;
            }
            else{
                isOk = false;
                return isOk;
            }
        }
        return isOk;
    }
    
    public boolean arePositiveAndSumDiagonalsIsSame(int[][] matice){
        int sumHlavni = 0;
        int sumVedlejsi = 0;
        for (int r = 0; r < matice.length; r++) {
            for (int c = 0; c < matice.length ; c++) {
                if (matice[r][c] < 0) { //nevim jestli pocitate 0 jako kladnou, dal jsem ze ne
                    return false;
                }
                if (c == r) {
                    sumHlavni += matice[r][c];
                }
                if (matice.length - r == c) {
                    sumVedlejsi += matice[matice.length - r][c];
                }
            }
        }
        if (sumHlavni == sumVedlejsi) {
           return true; 
        }
        else{
            return false;
        }
    }
    
    
}
