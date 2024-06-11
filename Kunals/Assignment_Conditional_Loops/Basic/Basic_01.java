package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        sc.close();

        System.out.println("Area of circle is: "+(3.14 * radius * radius));
    }
}
