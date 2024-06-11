package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

//Compound Interest Formula - P [(1 + i)n – 1]
public class Intermediate_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double interestRate = (sc.nextDouble())/100;
        System.out.println("Enter number of compounding years: ");
        int compoundingYears = sc.nextInt();
        sc.close();

        System.out.println("Compounding Interest: "+(amount * (Math.pow((1 + interestRate), compoundingYears)-1)));
    }
}
