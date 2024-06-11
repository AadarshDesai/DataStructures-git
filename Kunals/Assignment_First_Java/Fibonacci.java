package Kunals.Assignment_First_Java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int firstTerm = 0, secondTerm = 1;

        for(int i = 1; i<=n; i++){
            System.out.print(firstTerm+" ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
