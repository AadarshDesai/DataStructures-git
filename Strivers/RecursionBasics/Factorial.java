package Strivers.RecursionBasics;

public class Factorial {
    public static void main(String[] agrs){
        System.out.println(factorialOfN(5));
    }

    public static int factorialOfN(int n){
        if(n==1){
            return 1;
        }
        return n*factorialOfN(n-1);
    }
}
