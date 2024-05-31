package Lecture_Codes;

public class ColNoFixed {
    public static void main(String[] args) {
            int[][] arr = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };

        //traditional for.
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //enhanced for.
        for(int[] row : arr){
            for(int col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
