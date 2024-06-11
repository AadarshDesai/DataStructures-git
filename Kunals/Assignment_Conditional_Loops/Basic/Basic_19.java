package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        sc.close();

        System.out.println("Curved Surface Area Of Cylinder is: "+(2*3.14*radius*height));
    }
    
}
