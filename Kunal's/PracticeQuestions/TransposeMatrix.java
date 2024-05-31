package PracticeQuestions;

public class TransposeMatrix {
    public static void main(String[] args){
        int[][] matrix = {
            {2,4,-1},
            {-10,5,11},
            {18,-7,6}
        };
        for(int[] items: transpose(matrix)){
            for(int item: items){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix){
        int[][] tranMatrix = new int[matrix.length][matrix.length];
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                tranMatrix[col][row] = matrix[row][col];
            }
        }
        return tranMatrix;
    }
}
