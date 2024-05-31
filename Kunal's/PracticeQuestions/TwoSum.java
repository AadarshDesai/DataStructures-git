package PracticeQuestions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        int result=0;
            for(int i=0; i<nums.length; i++){
                result = target - nums[i];
                for(int j=i+1; j<nums.length; j++){
                    if(result == nums[j]){
                        return new int[]{i,j};
                    }
                }
            }
        return new int[]{};
    }
}
