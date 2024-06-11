package Kunals.PracticeQuestions;

// import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args){
        int[][] mat = {
            {0,0,0},
            {0,0,1},
            {0,0,1}
        };
        int[][] target = {
            {0,0,0},
            {0,0,1},
            {0,0,1}
        };
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target){
        int[][] rotate = rotateMat(mat);
        for(int i=0; i<4; i++){
            if(isEqual(rotate, target)){
                return true;
            }
            rotate = rotateMat(rotate);
        }
        return false;
    }

    public static int[][] rotateMat(int[][] mat){
        int[][] rotatedMat = new int[mat.length][mat.length];
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[row].length; col++){
                rotatedMat[row][col] = mat[col][row];
            }
        }
        int start = 0;
        int end = rotatedMat.length-1;
        while(start <= end){
            for(int i=0; i<rotatedMat.length; i++){
                int temp = rotatedMat[i][start];
                rotatedMat[i][start] = rotatedMat[i][end];
                rotatedMat[i][end] = temp;
            }
            start++;
            end--;
        }
        return rotatedMat;
    }

    public static boolean isEqual(int[][] rotatedMat, int[][] target){
        for(int row=0; row<rotatedMat.length; row++){
            for(int col=0; col<rotatedMat[row].length; col++){
                if(rotatedMat[row][col] != target[row][col]){
                    return false;
                }
            }
        }
        return true;
    }
}
