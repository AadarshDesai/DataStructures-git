package InterviewQuestions_BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {9,2,2,2,2};
        int target = 9;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }
        
        int ans = binarySearch(nums, target, 0, pivot);
        if(ans != -1){
            return ans;
        }else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            //4 cases here
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        // int start = 0;
        // int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
