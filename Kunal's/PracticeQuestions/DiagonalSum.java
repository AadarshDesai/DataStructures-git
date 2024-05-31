package PracticeQuestions;

public class DiagonalSum {
    public static void main(String[] args){
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat){
        int sum = 0;
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[row].length; col++){
                if(row==col){
                    sum += mat[row][col];
                }
            }
        }
        int temp = mat.length-1;
        for(int i=0; i<mat.length; i++){
            if(i != temp){
                sum += mat[i][temp];
            }
            temp--;
        }
        return sum;
    }
}


// public int diagonalSum(int[][] mat) {
//     int sum = 0;
//      int j = mat.length;
//      if(mat.length == 0){
//          sum=0;
//      }
//     for(int i=0; i< mat.length; i++){
//      sum += mat[i][i];
//      sum += mat[i][j-1-i];
//     }
//     if (j %2 != 0) {
//      sum -= mat[j/2][j/2];
//     }
//      return sum; 
//  }