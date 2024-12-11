
package Tkachov;


public class Methods {
   
    public static int[][] fillEven(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int value = 3;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (value % 2 != 0){
                value += 3;
                
                }
                matrix[i][j] = value;
                value +=3;
                }
                
            }
           return matrix; 
        }
    
   


    public static boolean arePositiveAndSumDiagonalsSame(int[][] matrix){
        int n = matrix.length;
        int mainSumDiag = 0;
        int secondaryDiag = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                    if (matrix[i][j] <=0){
                    return false;
                    }
            }
         mainSumDiag += matrix[i][i];
        secondaryDiag += matrix[i][n-1-i];   
        }
        return mainSumDiag == secondaryDiag;
        
        
        
    

    }
    public static int[] createPalindom(int[] array){
        int n = array.length;
        int[] palindrom = new int[2*n -1];
        for (int i = 0; i < n; i++){
            palindrom[i]= array[i];
           
            
        }
        for (int i= n-2; i>= 0 ; i--){
            
            palindrom[2*n-2 -i] = array[i];
            
        }
        return palindrom;
    
    }
    
   
    public static boolean constantSumNextTwo(int[] array){
        if(array.length < 2){
        return true;
        }
        
        int costantSum= array[0]+array[1];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] + array[i+1] != costantSum){
            
            return false;
            }
            
        }
    
    }
    
    
    //testovaci methoda
    public static void main(String[] args) {
        //testovani (1);
        int[][] matrix = fillEven(3,3);
        for (int[] row: matrix) {
            for(int value :row){
                System.out.print( value + " ");
            }
            System.out.println();
            
        }
        //testovani(2);
        int[][] testMatrix ={
            {2, 3, 4},
            {1, 6, 1},
            {7, 3, 2}
        };
        System.out.println("Diahonali ma stejnu summu a vseechni prvky jsou kladny: " + arePositiveAndSumDiagonalsSame(testMatrix));
    
    
        // testovani (3);
        
        int[] array = {1, 5, 8};
        int[] palindrom = createPalindom(array);
        System.out.println("palindrom z poslupnosti: ");
        for(int value : palindrom){
            System.out.print(value + " ");
            
        }
        System.out.println();
        
        
        
        // testovani (4)
        int[] constantSumArray ={12, 2, 5, 9, 7};
        System.out.println("summu par: " + constantSumNextTwo(constantSumArray));
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       
}
