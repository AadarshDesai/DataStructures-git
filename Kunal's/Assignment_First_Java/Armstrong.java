package Assignment_First_Java;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Please enter ending number: ");
        int end = sc.nextInt();
        sc.close();
        for(int num = start; num < end; num++){
            int temp = num;
            int count = 0;
            int sum = 0;
            while(num > 0){
                count++;
                num = num/10;
            }
            num = temp;
            while(num > 0){
                int r = num % 10;
                sum = sum + (int)Math.pow(r, count);
                num = num/10;
            }
            num = temp;
            if(temp == sum){
                System.out.println(num);
            }
        }
    }
}
