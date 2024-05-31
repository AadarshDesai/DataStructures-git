package Assignment_Functions;

import java.util.Scanner;

public class Func_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();
        sc.close();

        System.out.println("Largest of three numbers "+n1+", "+n2+", "+n3+" is: "+Largest(n1, n2, n3));
        System.out.println("Smallest of three numbers "+n1+", "+n2+", "+n3+" is: "+Smallest(n1, n2, n3));
    }

    static int Largest(int a, int b, int c){
        int max = a;
        if(b>a){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }

    static int Smallest(int a, int b, int c){
        int min = a;
        if(b<a){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}