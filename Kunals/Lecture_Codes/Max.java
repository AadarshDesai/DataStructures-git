package Kunals.Lecture_Codes;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 3));
    }

    // Work on edge cases here, like array being null.
    static int maxRange(int[] a, int start, int end){

        if(end > start){
            return -1;
        }

        if(a == null){
            return -1;
        }
        int maxVal = a[start];
        for(int i=start; i<=end; i++){
            if(a[i]>maxVal){
                maxVal=a[i];
            }
        }
        return maxVal;
    }

    static int max(int[] a){

        if(a.length == 0){
            return -1;
        }

        int maxVal = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>maxVal){
                maxVal=a[i];
            }
        }
        return maxVal;
    }
}
