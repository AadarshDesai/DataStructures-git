package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to add? - ");
        int n = sc.nextInt();

        double sum = 0;
        for(int i=1; i<=n; i++){
            System.out.print("Enter number "+i+": ");
            double numbers = sc.nextDouble();
            sum +=numbers;
        }
        System.out.println("Sum of N numbers: "+sum);
        sc.close();
    }
}
