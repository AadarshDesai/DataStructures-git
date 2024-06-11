package Kunals.Lecture_Codes;

public class ArrayBasics {
    public static void main(String[] args) {
        // int[] rnos = new int[5]; //Store 5 numbers
        // int[] rnos2 = {1,2,3,4,5}; //Store directly

        // int[] ros; //declaration of array. ros is getting defined in the stack.
        // ros = new int[5]; //Initialisation. here object is created in the heap.

        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);
        change(a, b);
        System.out.println(a+" "+b);

    }

    static void change(int a, int b){
        a = 20;
        b= 10;
    }
}