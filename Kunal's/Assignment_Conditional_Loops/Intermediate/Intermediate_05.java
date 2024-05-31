package Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point:");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter the coordinates of the second point:");
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        sc.close();
        
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance between the two points: " + distance);

    }

}
