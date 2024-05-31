package Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total runs: ");
        int runs = sc.nextInt();
        System.out.print("Enter total innings: ");
        int innings = sc.nextInt();
        System.out.print("Enter total outs: ");
        int outs = sc.nextInt();
        sc.close();

        int notOuts = innings - outs;
        System.out.println("Batting Average is: "+(double)(runs/notOuts));
    }
}
