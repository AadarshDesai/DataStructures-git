package Strivers.RecursionBasics;

import java.util.Scanner;

public class PrintNTimes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFun(n);
        sc.close();
    }

    public static void printFun(int N){
        if(N>0){
            printFun(N-1);
            System.out.println("Aadarsh");
            
        }
    }
}