package Assignment_Conditional_Loops.Basic;

import java.util.Scanner;

public class Basic_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        while(true){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if(n == 0){
                break;
            }else{
                sum += n;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
