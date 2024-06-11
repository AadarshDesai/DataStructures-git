package Kunals.Assignment_Functions;

import java.util.Scanner;

public class Func_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        sc.close();

        System.out.println("The Circumference of circle is: "+Circumference(radius)+"\nThe Area of circle is: "+Area(radius));
    }

    static double Circumference(double radius){
        return 2*3.14*radius;
    }

    static double Area(double radius){
        return 3.14*radius*radius;
    }
}
