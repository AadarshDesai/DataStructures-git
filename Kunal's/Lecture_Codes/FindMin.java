package Lecture_Codes;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.println(min2(nums));
    }

    static int min(int[] nums){
        if(nums.length == 0){
            return Integer.MIN_VALUE;
        }

        int min = nums[0];
        for(int item:nums){
            if(item<min){
                min = item;
            }
        }
        return min;
    }

    static int min2(int[] nums){
        if(nums.length == 0){
            return Integer.MIN_VALUE;
        }
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}
