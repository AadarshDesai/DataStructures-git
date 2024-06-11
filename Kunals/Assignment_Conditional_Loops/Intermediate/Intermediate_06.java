package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Sales Amount: ");
        double salesAmount = sc.nextDouble();
        System.out.println("Enter Total Commission: ");
        double commissionAmount = sc.nextDouble();
        sc.close();

        //formula
        double commissionPercentage = (commissionAmount/salesAmount)*100;

        System.out.println("Commission Percentage: "+commissionPercentage);
    }
}
