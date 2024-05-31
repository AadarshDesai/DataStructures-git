package Assignment_Functions;

import java.util.Scanner;

public class Func_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Product of "+a+" and "+b+" is: "+product(a, b));
    }

    static int product(int a, int b){
        return a*b;
    }
}
