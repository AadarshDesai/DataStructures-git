package Kunals.Assignment_Functions;

import java.util.Scanner;

public class Func_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(!isPalindrome(n)){
            System.out.println(n+" is not a palindrome number!");
        }else {
            System.out.println(n+" is a palindrome number!");
        }
        
    }

    static boolean isPalindrome(int n){
        int temp = n;
        int reversed = 0;
        while(n>0){
            int rem = n % 10;
            reversed = reversed*10 + rem;
            n = n/10;
        }
        return temp == reversed;
    }
}
