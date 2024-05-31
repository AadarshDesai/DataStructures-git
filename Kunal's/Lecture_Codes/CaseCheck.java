package Lecture_Codes;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        }else {
            System.out.println("Upper case");
        }
    }
}
