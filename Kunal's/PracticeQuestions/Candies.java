package PracticeQuestions;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class Candies {
    public static void main(String[] args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for(int i=1; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            result.add(candies[i]+extraCandies >= max);
        }
        return result;
    }
}