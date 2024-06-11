package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        while(true){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n < 0){
                sumNegative -= n;
            }else if(n > 0){
                if(n % 2 == 0){
                    sumPositiveEven += n;
                }else{
                    sumPositiveOdd += n;
                }
            }else {
                break;
            }
        }
        System.out.println("\n\nSum Of Negative Numbers: "+sumNegative+"\nSum Of Positive Even Numbers: "+sumPositiveEven+"\nSum of Positive Odd Numbers: "+sumPositiveOdd);
        sc.close();
    }
}
