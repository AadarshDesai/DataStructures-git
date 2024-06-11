package Strivers.RecursionBasics;

public class Recursion{
    public static void main(String[] args){
        fun(10);
    }
    public static void fun(int N){
        if(N>0){
            fun(N-1);
            System.out.print(N+" ");
        }
    }
}