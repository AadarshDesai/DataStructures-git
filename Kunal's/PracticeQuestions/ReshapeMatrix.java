package PracticeQuestions;

// import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args){
        int[][] mat = {
            {1,2},
            {3,4}
        };
        int r=1, c=4;
        for(int[] items: matrixReshape(mat, r, c)){
            for(int item: items){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c){
        int[][] res = new int[r][c];
        if(mat.length * mat[0].length != r*c){
            return mat;
        }
        int rowNum = 0;
        int colNum = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                res[rowNum][colNum] = mat[i][j];
                colNum++;
                if(colNum == c){
                    colNum = 0;
                    rowNum++;
                }
            }
        }
        return res;
    }
}
