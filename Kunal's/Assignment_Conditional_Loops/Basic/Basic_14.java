package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        sc.close();

        System.out.println("Volume of cone is: "+((3.14*radius*radius*height)/3));
    }
}
