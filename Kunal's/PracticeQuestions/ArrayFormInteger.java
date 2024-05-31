package PracticeQuestions;
import java.util.ArrayList;
import java.util.List;
public class ArrayFormInteger {
    public static void main(String[] args){
        int[] num = {2,7,4};
        int k = 181;
        System.out.println(addToArrayForm(num,k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> ans = new ArrayList<>();
            int carry = k;
            int i = num.length - 1;
            while(i>=0 || carry>0){
                if(i>=0){
                    carry = carry + num[i];
                }
                ans.add(0, carry%10);
                carry = carry/10;
                i--;
            }
            return ans;
    }
}