package Kunals.PracticeQuestions;

// import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums){
        // ArrayList<Integer> res = new ArrayList<>();
        // if(nums.length == 0){
        //     return 0;
        // }
        // if(nums.length == 1){
        //     return 1;
        // }
        // int temp = nums[0];
        // res.add(nums[0]);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] == temp){
        //         continue;
        //     }else{
        //         res.add(nums[i]);
        //         temp = nums[i];
        //         continue;
        //     }
        // }
        // System.out.println(res);
        // return res.size();
    // }

        int i=0; 
        for(int j=1; j<nums.length; j++){
            if(nums[i]!= nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
