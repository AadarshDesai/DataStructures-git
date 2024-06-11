package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int fact = 1;
        for(int i = n; i>0; i--){
            fact *= i;
        }
        System.out.println("Factoeial of "+n+"! is: "+fact);
    }
}
