package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if(n >= 1 && n <= 100000){
            int product = 1;
            int sum = 0;
            while(n > 0){
                int rem = n % 10;
                product = product*rem;
                sum = sum+rem;
                n = n/10;
            }
            System.out.println(product - sum);
        }
        
    }
}
