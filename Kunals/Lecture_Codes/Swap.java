package Kunals.Lecture_Codes;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        //swap two numbers
        // int temp = a;
        // a = b;
        // b = temp;

        swap(a, b);

        System.out.println(a +" "+b);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}