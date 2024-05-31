package Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to calculate an average for: ");
        int n = sc.nextInt();

        int sum = 0;
        int d = n;
        while(d != 0){
            System.out.print("Enter a number: ");
            double numbers = sc.nextInt();
            sum += numbers;
            d--;
        }
        System.out.println("Average of the numbers you have entered is: "+(sum/n));
        sc.close();
    }
}
