package Strivers.RecursionBasics;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNto1(n);
        System.out.println(Print1toN(n));
        sc.close();
    }

    public static void printNto1(int n){
        if(n>0){
            System.out.print(n+" ");
        printNto1(n-1);
        }
        return;
    }

    public static int Print1toN(int n){
        if(n == 0){
            return 0;
        }
        return Print1toN(n-1);
    }
}
