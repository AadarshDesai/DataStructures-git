package Lecture_Codes;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int countWhat = sc.nextInt();
        sc.close();
        int count = 0;

        while(n > 0){
            long rem = n % 10;
            if(rem == countWhat){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
