package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        sc.close();

        System.out.println("Area of rectangle is: "+(length*width));
    }
}
