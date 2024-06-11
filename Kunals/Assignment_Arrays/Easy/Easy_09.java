package Kunals.Assignment_Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Easy_09 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> arr = new ArrayList<>();
        int[] target = new int[nums.length];

        for(int i=0; i<nums.length;i++){
            arr.add(index[i], nums[i]);
        }
        
        for(int i=0; i<target.length; i++){
            target[i] = arr.get(i);
        }
        return target;
    }
}
