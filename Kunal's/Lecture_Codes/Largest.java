package Lecture_Codes;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max =c;
        }
        System.out.println("Largest is: "+max);
    }
}
