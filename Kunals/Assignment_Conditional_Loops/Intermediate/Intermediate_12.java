package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double sum = 0;
        for(int i = 1; i<=n; i++){
            System.out.print("Enter makrs for subject " +i+": ");
            double marks = sc.nextDouble();
            sum += marks;
        }
        System.out.println("Average Marks: "+(sum/n));
        sc.close();
    }
}