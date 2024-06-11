package Kunals.Assignment_Functions;

import java.util.Scanner;

public class Func_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Sum of "+a+" and "+b+" is: "+sum(a, b));
    }

    static int sum(int a, int b){
        return a+b;
    }
}
