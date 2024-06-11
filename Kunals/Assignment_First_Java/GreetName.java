package Kunals.Assignment_First_Java;

import java.util.Scanner;

public class GreetName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = sc.nextLine();
        System.out.println("Hi " +input + " welcome to the world of coding!");
        sc.close();
    }    
}