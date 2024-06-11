package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area of the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();
        sc.close();

        System.out.println("Volume of prism is: "+(base*height));
    }
}
