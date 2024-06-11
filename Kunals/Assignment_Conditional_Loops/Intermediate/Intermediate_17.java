package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int temp = n;
        int reverseNumber = 0;
        while(n>0){
            int rem = n % 10;
            reverseNumber = reverseNumber * 10 + rem;
            n = n/10;
        }
        System.out.println(reverseNumber);
        if(temp == reverseNumber){
            System.out.println("The number "+temp+" is palindrome!");
        }else{
            System.out.println("The number "+temp+" is not palindrome!");
        }
    }
}