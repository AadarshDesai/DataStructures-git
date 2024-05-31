package PracticeQuestions;

public class Anagram {
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));

    }

    public static boolean checkIfPangram(String sentence){
        int[] alphabets = new int[26];
        for(int i=0; i<sentence.length(); i++){
            alphabets[sentence.charAt(i)-'a']++;
        }
        for(int i=0; i<alphabets.length; i++){
            if(alphabets[i] == 0){
                return false;
            }
        } 
        return true;
    }
}
