package Assignment_First_Java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter Time In Years: ");
        double T = sc.nextDouble();
        System.out.print("Enter Rate Of Interest: ");
        double R = sc.nextDouble();

        double SI = P * T * R;
        System.out.println("Simple Intrest Is: " +SI);
        sc.close();
    }
}
