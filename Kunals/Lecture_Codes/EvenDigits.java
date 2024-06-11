package Kunals.Lecture_Codes;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {18, 124, 9, 1764, 98, 1};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int n){
        int count = 0;
        if(n<0){
            n = n * -1;
        }
        while(n>0){
            n = n/10;
            count++;
        }
        if(count%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
