package Kunals.InterviewQuestions_BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args){
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(findInMountainArray(target, arr));;
    }

    static int findInMountainArray(int target, int[] arr){
        int result = 0;
        int peak = peakIndexMountainArray(arr);
        result = (binarySearch(arr, target, 0, peak));
        if(result != -1){
            return result;
        }else{
            return binarySearch(arr, target, peak+1, arr.length-1);
        }

    }

    static int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in dec part of array
                //this may be the answer but look at left
                end = mid;
            }else{
                // you are in ascending part of array
                start = mid+1; //because we know mid+1 > mid
            }
        }
        // in the end, start == end and pointing to the largest number because of 2 checks above
        return start;
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
