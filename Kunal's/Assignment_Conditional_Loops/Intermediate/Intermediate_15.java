package Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of things: ");
        int n = sc.nextInt();
        System.out.print("Enter number of things to be chosen: ");
        int r = sc.nextInt();
        sc.close();

        int factn = 1;
        int factr = 1;
        int factn_r = 1;

        for(int i = n; i>0; i--){
            factn *= i;
        }

        for(int i = r; i>0; i--){
            factr *= i;
        }

        for(int i=n-r; i>0; i--){
            factn_r *= i;
        }

        System.out.println("nPr: "+(factn/factn_r));
        System.out.println("nCr: "+(factn/(factr* factn_r)));
    }
}