package Assignment_Arrays.Easy;

public class Easy_07 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
