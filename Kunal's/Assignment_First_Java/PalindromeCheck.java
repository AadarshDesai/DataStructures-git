package Assignment_First_Java;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        String reversedString = "";
        for(int i=input.length()-1; i>=0; i--){
            reversedString =reversedString+input.charAt(i);
        }
        if(input.equals(reversedString)){
            System.out.println("Palindorme");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
