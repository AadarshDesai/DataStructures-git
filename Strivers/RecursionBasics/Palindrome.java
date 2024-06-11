package Strivers.RecursionBasics;

public class Palindrome {
    public static void main(String[] args){
        System.out.println(palindrome("0P", 0));
        }

    public static boolean palindrome(String str, int i){
        str = str.replaceAll("[^A-Za-z0-9]+","").toLowerCase();
        if(i>=str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return palindrome(str, i+1);
    }
}
