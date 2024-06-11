package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.println("Enter the side: ");
        double side = sc.nextDouble();
        sc.close();

        System.out.println("Perimeter of parallelogram is: "+(base+side)*2);
    }
}
