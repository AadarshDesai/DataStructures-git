package Kunals.Lecture_Codes;
import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int p = 0;
        int i = 1;
        int count = 2;

        while(count <= n){
            int temp = i;
            i = i+p;
            p = temp;
            count++;
        }
        System.out.println("Nth Fibonacci number is: "+i);
    }
}
