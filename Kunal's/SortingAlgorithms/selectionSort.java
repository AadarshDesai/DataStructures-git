package SortingAlgorithms;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args){
        int[] nums = {4,5,1,2,3};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int first = i;
            int minIndex = getMin(arr, first, arr.length-1);
            int temp = arr[minIndex];
            arr[minIndex] = arr[first];
            arr[first] = temp; 

        }
    }

    static void SelectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMax(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static int getMin(int[] arr, int start, int end){
        int min = start;
        for(int i=start; i<=end; i++){
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
