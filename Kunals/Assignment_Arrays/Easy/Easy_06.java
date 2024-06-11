package Kunals.Assignment_Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class Easy_06 {
    public static void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> ans= new ArrayList<Boolean>(candies.length);
        int greatest = candies[0];
        for(int i=1; i<candies.length; i++){
            if(candies[i] > greatest){
                greatest = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            ans.add(candies[i]+extraCandies >= greatest);
        }
        return(ans);
    }
}
