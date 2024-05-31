package Assignment_Functions;

import java.util.Scanner;

public class Func_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The number "+n+" is "+OddEven(n));
    }

    static String OddEven(int n){
        if(n % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}
