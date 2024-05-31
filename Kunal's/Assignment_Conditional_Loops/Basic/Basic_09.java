package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of triangle: ");
        double side = sc.nextDouble();
        sc.close();

        System.out.println("The perimeter of equilateral triangle is: "+(3*side));
    }
}
