package Assignment_Arrays.Easy;

import java.util.Arrays;

public class Easy_02 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

    static int[] getConcatenation(int[] nums){
        int[] ans = new int[2*nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
