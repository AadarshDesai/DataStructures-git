package Assignment_Arrays.Easy;

import java.util.Arrays;

public class Easy_21 {
    public static void main(String[] args){
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target){
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result = target - nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(result == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
