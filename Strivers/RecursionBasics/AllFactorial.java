package Strivers.RecursionBasics;

import java.util.ArrayList;

public class AllFactorial {
    public static void main(String[] args){
        System.out.println(factorialNumbers(6));
    }

    public static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> arr = new ArrayList<>();
        long fact =1;
        long temp =1;
        while(temp <= N){
            if(temp==1) arr.add(temp);
            else{
                fact = fact*temp;
                if(fact>N) return arr; // you dont have to calculate factorial if its going to exceed N
                arr.add(fact);
            }
            temp++;
        }
        return arr;
    }
    
    // public static long factorial(long n){
    //     if(n==1) return 1;
    //     return n * factorial(n-1);
    // }
}
