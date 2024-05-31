package Lecture_Codes;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 199;
        System.out.println(linearSearch(nums, target));
    }


    //Search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //Run a for loop
        for(int index=0; index<arr.length; index++){
            //Check for element at every index if it is = target
            if(arr[index] == target){
                return index;
            }
        }
        //this line will execute if none of the return statement above have executed.
        //hence the  target not found.
        return -1;
    }
}