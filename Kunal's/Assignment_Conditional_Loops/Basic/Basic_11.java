package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        sc.close();

        System.out.println("Perimeter of Rectangle is: "+(length+width)*2);
    }
}
