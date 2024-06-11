package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);
        sc.close();

        /* 
        Using IF-ELSE - 

            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                System.out.println("Vowel");
            }else {
                System.out.println("Constant");
            }
        */

        //Using Enhanced Switch Case - 
        switch (ch) {
            case 'a','e','i','o','u','A','E','I','O','U' -> System.out.println("Vowel");    
            default -> System.out.println("Constant");
        }
    }
}
