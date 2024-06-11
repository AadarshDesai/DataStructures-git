package Kunals.Lecture_Codes;

import java.util.Arrays;
// import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // //array of primitives.
        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 233;
        // arr[3] = 543;
        // arr[4] = 3;
        // //[23, 45, 233, 543, 3]
        // System.out.println(arr[3]);

        //input using for loop
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // for(int num: arr){ //for every element in array, print the element.
        //     System.out.print(num+" "); //here num represents the element of array.
        // }

        // System.out.println(arr[5]); //Index out of bound error.

        // System.out.println(Arrays.toString(arr));

        // 

        //array of objects.
        String[] str = new String[5];
        for(int i =0; i<str.length; i++){
            str[i] = sc.nextLine();
        }

        sc.close();
        str[0] = "Aadarsh";
        System.out.println(Arrays.toString(str));
    }
}
