package InterviewQuestions_BinarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {18, 16, 14, 9, 5, 3, 2};
        int target = 19;
        System.out.println(Ceiling(arr, target));
    }

    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end =  arr.length-1;
        boolean isAsc = arr[start] < arr[end];
            if(isAsc){
                if(target > arr[arr.length-1]){
                    return -1;
                }
            }
            while(start <= end){
                int mid = start + (end - start)/2;
                if(target == arr[mid]){
                    return arr[mid];
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
            if(isAsc){
                return start;
            }else{
                return end;
            } 
    }
}