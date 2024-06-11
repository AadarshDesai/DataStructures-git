package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        String reversedString = "";
        for(int i=input.length()-1; i>=0; i--){
            reversedString += input.charAt(i);
        }

        System.out.println("Your input in reverse is: "+reversedString);
    }
}
