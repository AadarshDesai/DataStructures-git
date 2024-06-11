package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

//Fibonacci series upto nth number.
public class Basic_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int first = 0;
        int second = 1;
        int temp = 0;
        while(first < n){
            System.out.print(first+" ");
            temp = first + second;
            first = second;
            second = temp;
        }  
    }
}
