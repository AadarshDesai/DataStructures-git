package Kunals.InterviewQuestions_CycleSort;

// import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = 2;
        // missingNumber(nums, n);
        System.out.println(missingNumber(nums, n));
        // System.out.println(Arrays.toString(nums));
    }

    static int missingNumber(int[] nums, int n){
        for(int i=0; i<nums.length; i++){
            while(nums[i]< nums.length && nums[i] != i){
                swap(nums, i, nums[i]);
            }
        }
        
        // search for missing number
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
