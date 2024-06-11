package Kunals.Lecture_Codes;

public class BinarySearchIndex {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 0, 1, 3, 5, 8, 10, 21, 35, 55, 67, 90, 1000};
        int target = -17;
        System.out.println(binarySearch(arr, target));
    }

    // return the index
    // return -1 if not found.
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
