package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        double side = sc.nextDouble();
        sc.close();

        System.out.println("Perimeter of square is: "+(4*side));
    }
}
