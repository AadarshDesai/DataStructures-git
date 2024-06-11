package Kunals.Assignment_Functions;

import java.util.Scanner;


public class Func_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of "+n+"! is: "+Factorial(n));
    }

    static int Factorial(int n){
        int result = 1;
        for(int i=n; i>0; i--){
            result *= i;
        }
        return result;
    }
}