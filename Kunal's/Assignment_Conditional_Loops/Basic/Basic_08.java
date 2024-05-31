package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        sc.close();

        System.out.println("The perimeter of Circle is: "+(2*3.14*radius));
    }
}
