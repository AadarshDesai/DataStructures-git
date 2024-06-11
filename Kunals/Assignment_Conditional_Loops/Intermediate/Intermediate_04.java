package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        double amount = sc.nextDouble();
        sc.close();

        double finalAmount = 0;
        if(amount < 500){
            finalAmount = amount;
        }else if(amount >= 500 && amount <= 1000){
            finalAmount = amount - amount * 0.10;
        } else if(amount > 1000 && amount <= 2000){
            finalAmount = amount - amount * 0.15;
        } else {
            finalAmount = amount - amount * 0.20;
        }
        System.out.println("There is a discount on the purchase of 500$ or above.\nYour final amount is: "+finalAmount+"$");
    }
}
