package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double side = sc.nextDouble();
        sc.close();

        System.out.println("Total Surface Area Of Cube is: "+(6*side*side));
    }
}