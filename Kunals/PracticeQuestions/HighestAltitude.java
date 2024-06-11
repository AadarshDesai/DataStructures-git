package Kunals.PracticeQuestions;

public class HighestAltitude {
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain){
        int max = 0;
        int result = 0;
        for(int i=0; i<gain.length; i++){
            result += gain[i];
            if(result > max){
                max = result;
            }
        }

        return max;
    }
}
