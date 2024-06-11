package Kunals.Lecture_Codes;

public class Palindrome {
    public static void main(String[] args){
        String s = "";
        if(isPalindrome(s)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
        
    }


    static boolean isPalindrome(String s){
        s.toLowerCase();
        for(int i=0; i<s.length()/2; i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            
            if(start != end){
                return false;
            }
        }
        return true;
    }

    // static boolean isPalindrome(String s){
    //     char[] c = s.toCharArray();
    //     int last = c.length-1;
    //     for(int i=0; i<c.length/2; i++){
    //         if(c[i] == c[last]){
    //             last--;
    //         }else{
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
