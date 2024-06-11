package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int sum=0;
        while(n>0){
            int rem = n % 10;
            sum += rem;
            n = n/10;
        }

        System.out.println("Sum of Digits: "+sum);
    }
}