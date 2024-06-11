package Kunals.Lecture_Codes;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int[] arr = {1000, 90, 77, 77, 28, 12, 5, 4, 3, 2, -2, -67};
        int[] arr2 = {-18, -12, 0, 1, 3, 5, 8, 10, 21, 35, 55, 67, 90, 1000};
        int target = 2;
        System.out.println(BinarySearch(arr2, target));
    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end =  arr.length-1;
        boolean isAsc = arr[start] < arr[end];
            while(start <= end){
                int mid = start + (end - start)/2;
                if(target == arr[mid]){
                    return mid;
                }

                if(isAsc){
                    if(target < arr[mid]){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }else{
                    if(target > arr[mid]){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }
                
            }
        return -1;        
    }
}
