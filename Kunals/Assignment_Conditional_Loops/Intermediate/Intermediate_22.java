package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

/*
 The sum of its positive divisors excluding the number itself is equal to that number is called perfect number.
 */
public class Intermediate_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println(n+ " is a perfect number!");
        }else {
            System.out.println(n+ " is not a perfect number!");
        }
    }
}
