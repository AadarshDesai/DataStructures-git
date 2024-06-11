package Strivers.RecursionBasics;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,3,2,5,4};
        reverseArray(arr, 0, arr.length);
        for(int item : arr){
            System.out.print(item+" ");
        }
    }

    public static void reverseArray(int[] arr, int i, int n){
        if(i>=n/2) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverseArray(arr, i+1, n);
    }
}
