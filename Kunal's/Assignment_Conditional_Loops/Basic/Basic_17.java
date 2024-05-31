package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entet the radius: ");
        double radius = sc.nextDouble();
        sc.close();

        System.out.println("Volume of Sphere is: "+(4*3.14*radius*radius*radius)/3);
    }
}
