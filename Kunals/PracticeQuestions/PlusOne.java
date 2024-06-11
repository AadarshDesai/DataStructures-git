package Kunals.PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args){
        int[] digits = {1,2,3,4};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits){
        List<Integer> list = new ArrayList<>();
            int carry = 1;
            int i = digits.length - 1;
            while(i>=0 || carry>0){
                if(i>=0){
                    carry = carry + digits[i];
                }
                list.add(0, carry%10);
                carry = carry/10;
                i--;
            }
        // }
        int[] res = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            res[j] = list.get(j);
        }
        return res;
    }
}
