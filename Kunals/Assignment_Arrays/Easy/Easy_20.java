package Kunals.Assignment_Arrays.Easy;

public class Easy_20 {
    public static void main(String[] args){
        int[][] matrix = {
            {0,1,1,0},
            {1,0,0,1},
            {0,1,0,1},
            {0,0,1,0}
        };
        int[][] target = {
            {0,1,0,0},
            {1,0,1,0},
            {1,0,0,1},
            {0,1,1,0}
        };
        for(int[] values: swap(transposeMatrix(matrix))){
            for(int value: values){
                System.out.print(value+" ");
            }
            System.out.println();
        }
        System.out.println(findRotation(matrix, target));
    }


    static boolean findRotation(int[][] matrix, int[][] target){
        for(int i=0;i<4; i++){
            if(canRot(matrix, target)){
                return true;
            }else{
                matrix = swap(transposeMatrix(matrix));
            }
        }
        return false;
    }

    static boolean canRot(int[][] rotate, int[][] target){
        if(rotate.length != target.length){
            return false;
        }
        if(rotate[0].length != target[0].length){
            return false;
        }
        for(int r=0; r<rotate.length; r++){
            for(int c=0; c<rotate[r].length; c++){
                if(rotate[r][c] != target[r][c]){
                    return false;
                }
            }
        }
        return true;
    }


    static int[][] transposeMatrix(int[][] matrix){
        int[][] res = new int[matrix.length][matrix[0].length];
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                res[col][row] = matrix[row][col];
            }
        }
        return res;
    }

    static int[][] swap(int[][] matrix){
        for(int col_1 = 0, col_2 = matrix.length-1; col_1<matrix.length/2; col_1++, col_2--){
            for(int r=0; r<matrix.length; r++){
                int temp = matrix[r][col_1];
                matrix[r][col_1] = matrix[r][col_2];
                matrix[r][col_2] = temp;
            }
        }
        return matrix;
    }
}
