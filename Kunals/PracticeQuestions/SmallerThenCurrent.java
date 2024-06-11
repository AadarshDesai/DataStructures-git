package Kunals.PracticeQuestions;

import java.util.Arrays;

public class SmallerThenCurrent {
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i != j && nums[i] > nums[j]){
                    result[i]++;
                }
            }
        }
        return result;
    }
}
