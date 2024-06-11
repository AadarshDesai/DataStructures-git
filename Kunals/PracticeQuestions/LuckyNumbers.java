package Kunals.PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static void main(String[] args){
        int[][] matrix = {
            {3,7,8},
            {9,11,13},
            {15,16,17}
        };
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix){
        List<Integer> luckyNumber = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            int min = matrix[i][0];
            int col = 0;
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    col = j;
                }
            }
            
            boolean isTrue = true;
            for(int k=0; k<matrix.length; k++){
                if(matrix[i][col] < matrix[k][col]){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue){
                luckyNumber.add(matrix[i][col]);
            }
        }
        return luckyNumber;
    }

    
}
