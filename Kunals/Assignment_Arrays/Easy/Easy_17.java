package Kunals.Assignment_Arrays.Easy;

public class Easy_17 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6}
        };
        for(int[] items:transpose(matrix)){
            for(int value: items){
                System.out.print(value+" ");
            }
            System.err.println();
        }
    }

    static int[][] transpose(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int[][] transposeMatrix = new int[colLen][rowLen];
        for(int i=0; i<rowLen; i++){
            for(int j =0; j<colLen; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}
