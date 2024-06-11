package Kunals.Assignment_Functions;

import java.util.Scanner;

public class Func_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        if(!Vote(age)){
            System.out.println("Sorry, you are not eligible to vote!");
        }else{
            System.out.println("You are eligible to vote!");
        }
    }

    static Boolean Vote(int age){
        return age >= 18;
    }
}
