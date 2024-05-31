package Assignment_Functions;

import java.util.Scanner;

public class Func_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int side1 = sc.nextInt();
        System.out.print("Enter second side: ");
        int side2 = sc.nextInt();
        System.out.print("Enter third side: ");
        int side3 = sc.nextInt();
        sc.close();

        if(!isPythagorean(side1, side2, side3)){
            System.out.println("Triangle is not Pythagorean!");
        }else{
            System.out.println("Triangle is Pythagorean!");
        }
    }

    static boolean isPythagorean(int a, int b, int c){
        if(a*a + b*b > c*c){
            return true;
        }
        if(a*a + c*c > b*b){
            return true;
        }
        if(b*b + c*c > a*a){
            return true;
        }
        else return false;
    }
}
