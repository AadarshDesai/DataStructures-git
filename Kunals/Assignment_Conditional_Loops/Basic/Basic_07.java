package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area: ");
        double area = sc.nextDouble();
        sc.close();

        System.out.println("Area of equilateral triangle is: "+(1.732/4)*area*area);
    }
}
