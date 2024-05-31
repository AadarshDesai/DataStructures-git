package Assignment_Functions;

import java.util.Scanner;

public class Func_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of n natural numbers for "+n+" is: "+sumNatural(n));
    }

    static int sumNatural(int n){
        int sum=0;
        for(int i=n; i>0; i--){
            sum += i;
        }
        return sum;
    }
}
