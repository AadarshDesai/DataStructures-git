package Kunals.InterviewQuestions_BinarySearch;

public class PeakMountain {
    public static void main(String[] args){
        int[] num = {0,1,0};
        System.out.println(peakIndexMountainArray(num));
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
        return arr[start];
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
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