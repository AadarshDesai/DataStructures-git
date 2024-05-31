package Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int count =0;
        int temp = number;
        double result = 0;
        while(number>0){
            number = number/10;
            count++;
        }
        number = temp;
        while(number>0){
            int rem = number % 10;
            result = result + Math.pow(rem, count);
            number = number/10;
        }
        if(result == temp){
            System.out.println("The number "+temp+" is an Armstrong number!");
        }else {
            System.out.println("The number "+temp+" is not an Armstrong number!");
        }
    }
}
