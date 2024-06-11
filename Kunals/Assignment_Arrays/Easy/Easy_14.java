package Kunals.Assignment_Arrays.Easy;

// import java.util.Arrays;

public class Easy_14 {
    public static void main(String[] args) {
        int m = 2;
        int n = 2; 
        int[][] indices = {{1,1}, {0,0}};
        System.out.println(oddCells(m,n,indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] incrementArray = new int[m][n];
        for(int i=0; i<indices.length; i++){
            int[] index = indices[i];
            for(int row=0; row<n; row++){
                incrementArray[index[0]][row]++;
            }
            for(int col = 0; col<m; col++){
                incrementArray[col][index[1]]++;
            }
        }
        int count = 0;
        for(int row=0; row<incrementArray.length; row++){
            for(int col=0; col<incrementArray[row].length; col++){
                if(incrementArray[row][col] %2 != 0){
                    count++;
                }
            }
        }
        return count;
    }

    // int[][] incrementArray = new int[m][n];
    //     int count=0;
    //     for(int row=0; row<indices.length; row++){
    //         int[] index = indices[row];
    //         incrementArray = increment(incrementArray, index);
    //     }
    //     for(int row=0; row<incrementArray.length; row++){
    //         for(int col=0; col<incrementArray[row].length; col++){
    //             if((incrementArray[row][col])%2 != 0){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;

    // static int[][] increment(int[][] incrementArray, int[] index){
    //     for(int i=0; i<index.length; i++){
    //         if(i==0){
    //             for(int col = 0; col<=incrementArray.length; col++){
    //                 incrementArray[i][col]++;
    //             }
    //         }else{
    //             for(int row=0; row<incrementArray.length; row++){
    //                 incrementArray[row][i]++;
    //             }
    //         }
    //     }
    //     return incrementArray;
    // }
}