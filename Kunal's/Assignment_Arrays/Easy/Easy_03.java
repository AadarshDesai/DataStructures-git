package Assignment_Arrays.Easy;

import java.util.Arrays;

public class Easy_03 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1]+nums[i];
        }
        return ans;
    }
}
