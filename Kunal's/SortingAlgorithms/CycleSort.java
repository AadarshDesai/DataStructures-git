package SortingAlgorithms;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args){
        int[] nums = {3,5,2,1,4};
        Cycle(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void Cycle(int[] nums){
        for(int i=0; i<nums.length; i++){
            while(nums[i]-1 != i){
                swap(nums, i, nums[i]-1);
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] =  nums[second];
        nums[second] = temp;
    }
}
