package PracticeQuestions;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Scanner;
public class Rough {
    public static void main(String[] args){
        // ArrayList<Integer> list = new ArrayList<>(3);
        // Scanner sc = new Scanner(System.in);
        // for(int i =0; i<5; i++){
        //     list.add(sc.nextInt());
        // }
        // sc.close();

        // System.out.println(list);
        // list.set(0, 0);
        // System.out.println(list);
        // list.remove(0);
        // System.out.println(list);

        //Multi Dimensiona ArrayList
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // for(int i=0; i<3; i++){
        //     list.add(new ArrayList<>());
        // }

        // for(int i=0; i< 3; i++){
        //     for(int j=0; j<3; j++){
        //         list.get(i).add(sc.nextInt());
        //     }
        // }

        // System.out.println(list);

        int[] arr = {1,3,56, 20, 88,10};
        System.out.println(Arrays.toString(reverse(arr)));
        }

        static int[] reverse(int[] arr){
            int start = 0;
            int end = arr.length-1;
            while(start <= end){

                swap(arr, start, end);
                start++;
                end--;
            }
            return arr;

        }

        static void swap(int[] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }

        static int max(int[] arr, int index1, int index2){
            int max = arr[index1];
            for(int i=index1; i<=index2; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }


}
