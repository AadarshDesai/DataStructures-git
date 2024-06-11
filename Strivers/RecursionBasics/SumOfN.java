package Strivers.RecursionBasics;

public class SumOfN {
    public static void main(String[] args){
        int n = 5;
        int sum = 0;
        sumTillN(n,sum);
        System.out.println(sumTill(10));
    }

    public static void sumTillN(int n, int sum){
        if(n<=0){
            System.out.println(sum);
            return;
        }
        sumTillN(n-1, sum+n);
        
    }

    public static int sumTill(int n){
        if(n==1) return 1;
        return n + sumTill(n-1);
    }
}
