package Kunals.Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        while(true){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if(n == 0){
                break;
            }else if(n > max){
                max = n;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
