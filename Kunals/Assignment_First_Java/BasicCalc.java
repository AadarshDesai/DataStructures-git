package Kunals.Assignment_First_Java;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers and an operation you want to perform (+, -, *, /). \n i.e - 5 2 *  ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double result = 0;

        if (operator == '+'){
            result = number1 + number2;
        }
        else if (operator == '-'){
            result = number1 - number2;
        }
        else if (operator == '*'){
            result = number1 * number2;
        }
        else if (operator == '/'){
            result = number1 / number2;
        }
        System.out.println("The result is: "+result);
        sc.close();
    }
}
