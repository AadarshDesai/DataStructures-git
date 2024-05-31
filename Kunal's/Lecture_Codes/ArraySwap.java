package Lecture_Codes;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 56};

        // swap(arr, 1, 3);
        System.out.println("Array before reversing: "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("Array in reverse order: "+Arrays.toString(arr));
    }

    //Two pointer method.
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
