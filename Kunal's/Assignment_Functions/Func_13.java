package Assignment_Functions;

import java.util.Scanner;

public class Func_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        sc.close();
        for(int i=n1; i<=n2; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }else{
                System.out.print("");
            }
        }
    }

    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
