package Kunals.Assignment_Arrays.Easy;

import java.util.Arrays;

public class Easy_08 {
    public static void main(String[] args) {
        int[] nums={7,7,7,7};
        System.out.println(Arrays.toString(smallNumbersThanCurrent(nums)));
    }

    static int[] smallNumbersThanCurrent(int[] nums){
        int[] counts = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    counts[i]++;
                }
            }
        }
        return counts;
    }
}
