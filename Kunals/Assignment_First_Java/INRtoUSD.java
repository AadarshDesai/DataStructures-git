package Kunals.Assignment_First_Java;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in INR to convert it into USD: ");
        double currencyINR = sc.nextDouble();
        double cureencyUSD = currencyINR / 83.33;
        System.out.println(cureencyUSD+"$");
        sc.close();
    }
}
