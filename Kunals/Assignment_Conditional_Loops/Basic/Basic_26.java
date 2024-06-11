package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        sc.close();

        System.out.println("Addition of two numbers is: "+(n1+n2));
    }
}
