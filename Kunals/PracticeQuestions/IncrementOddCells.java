package Kunals.PracticeQuestions;

public class IncrementOddCells {
    public static void main(String[] args){
        int m = 2, n = 3;
        int[][] indices = {
            {0,1},
            {1,1}
        };
        System.out.println(oddCells(m,n,indices));
    }

    public static int oddCells(int m, int n, int[][] indices){
        int[][] result = new int[m][n];
        for(int[] index: indices){
            for(int row=0; row<n; row++){
                result[index[0]][row]++;
            }
            for(int col=0; col<m; col++){
                result[col][index[1]]++;
            }
        }
        int count = 0;
        for(int row=0; row<result.length; row++){
            for(int col=0; col<result[row].length; col++){
                if(result[row][col]%2 !=0){
                    count++;
                }
            }
        }
        return count;
    }
}
