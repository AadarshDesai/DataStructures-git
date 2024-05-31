package Assignment_Functions;

import java.util.Scanner;

public class Func_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(!isPrime(n)){
            System.out.println(n+" is not a prime number!");
        }else{
            System.out.println(n+" is a prime number!");
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
