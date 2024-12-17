// Add all the elements of a matrix

public class Program48 {
   public static void main(String[] args){
      int[][] inputMatrix = {{10, 20, 30}, 
                             {40, 50, 60}, 
                             {70, 80, 90}};
      int sum = sumOfMatElmt(inputMatrix);
      System.out.println("Sum of matrix elements: " + sum);
    }
   public static int sumOfMatElmt(int[][] mat) {
      int sum = 0;
      for (int i = 0; i < mat.length; i++) {
         for (int j = 0; j < mat[i].length; j++) {
            sum += mat[i][j];
         }
      }
      return sum;
    }
 }