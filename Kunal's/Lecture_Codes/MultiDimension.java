package Lecture_Codes;

import java.util.Scanner;

public class MultiDimension {
        public static void main(String[] args) {
            /*
        Matrix Kind Of Structure.
        [][][] 1 2 3
        [][][] 4 5 6
        [][][] 7 8 9
        */


        //Array of arrays.

        //2D array defination
        //  int[][] arr = new int[3][]; //Mentioning number of rows is mandatory but number of columns is not mandatory.
        Scanner sc = new Scanner(System.in);
        // int[][] arr = {
        //     {1, 2, 3}, //0th index
        //     {4, 5}, //1st index
        //     {6, 7, 8, 9} //2nd index -> arr[2] = {6, 7, 8, 9}
        // };

        int[][] arr = new int[3][3];

        //input
        for(int row=0; row<arr.length; row++){
            //for each col in every row
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        sc.close();

        // //output
        // for(int row=0; row<arr.length; row++){
        //     //for each col in every row
        //     for(int col=0; col<arr[row].length; col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        // //output
        // for(int row=0; row<arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //enhanced for loop
        for(int[] item: arr){
            for(int cols: item){
                System.out.print(cols+" ");
            }
            // System.out.println(Arrays.toString(item));
            System.out.println();
        }
    }   
}