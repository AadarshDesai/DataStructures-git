package Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of years: ");
        int numberOfYears = sc.nextInt();
        System.out.print("Enter starting amount: ");
        double startingAmount = sc.nextDouble();
        System.out.print("Enter interest rate per year: ");
        double interestRate = sc.nextDouble();
        sc.close();

        System.out.println("Future Value of your asset is: "+(startingAmount*Math.pow((1+(interestRate/100)),numberOfYears)));
    }
}
