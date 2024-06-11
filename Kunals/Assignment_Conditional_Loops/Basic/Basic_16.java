package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();
        sc.close();

        System.out.println("Volume of cylinder is: "+(3.14*radius*radius*height));
    }
}
