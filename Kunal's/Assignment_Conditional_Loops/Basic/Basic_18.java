package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base length: ");
        double length = sc.nextDouble();
        System.out.print("Enter base width: ");
        double width = sc.nextDouble();
        System.out.print("Enter base height: ");
        double height = sc.nextDouble();
        sc.close();

        System.out.println("Volume of Pyramid is: "+(length*width*height)/3);
    }
}
