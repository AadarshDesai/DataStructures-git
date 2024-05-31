package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height: ");
        double height = sc.nextDouble();
        System.out.print("Enter Base: ");
        double base = sc.nextDouble();
        sc.close();

        System.out.println("Area of isosceles triangle is: "+(base*height)/2);
    }
}
