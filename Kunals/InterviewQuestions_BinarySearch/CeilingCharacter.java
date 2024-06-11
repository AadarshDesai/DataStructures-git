package Kunals.InterviewQuestions_BinarySearch;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class CeilingCharacter {
    public static void main(String[] args) {
        char[] letters = {'j', 'f', 'c'};
        System.out.println(Ceiling(letters, 'v'));
    }

    static char Ceiling(char[] arr, char target){
        int start = 0; 
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        if(isAsc){
            if(target > arr[arr.length-1]){
                return arr[0];
            }
        }else{
            if(target > arr[0]){
                return arr[arr.length-1];
            }
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid == arr.length-1){
                if(target == arr[mid]){
                    return arr[0];
                }else if(target < arr[mid]){
                    return arr[mid];
                }
                
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
            return arr[start];
        }else{
            return arr[end];
        }
    }
}
