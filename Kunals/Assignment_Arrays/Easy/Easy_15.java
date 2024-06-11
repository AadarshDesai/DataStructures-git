package Kunals.Assignment_Arrays.Easy;

public class Easy_15 {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = mat.length;
        for(int i=0; i< mat.length; i++){
            sum += mat[i][i];
            sum += mat[i][j-1-i];
        }
        if (j %2 != 0) {
            sum -= mat[j/2][j/2];
        }
        return sum;
    }
}