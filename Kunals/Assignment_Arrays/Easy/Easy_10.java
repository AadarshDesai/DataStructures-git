package Kunals.Assignment_Arrays.Easy;

// import java.util.ArrayList;

public class Easy_10 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence){
        int[] arr = new int[26];

        for(int i=0; i<sentence.length(); i++){
            arr[sentence.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++){
            if(arr[i]<1){
                return false;
            }
        }
        return true;
    }
}
