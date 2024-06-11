package Kunals.Assignment_Arrays.Easy;

import java.util.Arrays;

// import java.util.Scanner;

public class Easy_01 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[]  nums = {5, 0, 1, 2, 3, 4};
        int[] reuslt = ResultArray(nums);

        System.out.println(Arrays.toString(reuslt));
    }

    static int[] ResultArray(int[] nums){
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}