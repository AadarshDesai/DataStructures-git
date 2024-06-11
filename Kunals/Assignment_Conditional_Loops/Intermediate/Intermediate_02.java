package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of untis consumed: ");
        int unit = sc.nextInt();
        sc.close();

        double billAmount = 0;
        if(unit <= 100){
            billAmount = 10;
        }else if(unit <=200){
            billAmount = (unit - 100) * 0.20 + 10;
        }else if(unit <= 300){
            billAmount = (unit - 200) * 0.50 + 100 * 0.20 + 10;
        }else if(unit <= 400){
            billAmount = (unit - 300) * 0.75 + 100 * 0.50 + 100 * 0.20 + 10;
        } else {
            billAmount = (unit - 400)* 1.00 + 100 * 0.75 + 100 * 0.50 + 100 * 0.20 + 10;
        }

        System.out.println("Your Electricity Bill is: "+billAmount+"$.");
    }
}
