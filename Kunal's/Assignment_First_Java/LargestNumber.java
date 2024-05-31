package Assignment_First_Java;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if(number1 > number2){
            System.out.println("Largest Number is: "+number1);
        }else {
            System.out.println("Largest Number is: "+number2);
        }
        sc.close();
    }
}
