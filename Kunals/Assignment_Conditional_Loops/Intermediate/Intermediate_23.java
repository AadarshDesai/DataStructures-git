package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.close();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year!");
                }else{
                    System.out.println("Not A Leap Year!");
                }
            }else{
                System.out.println("Leap Year!");
            }
        }else {
            System.out.println("Not A Leap Year!");
        }
    }
}
