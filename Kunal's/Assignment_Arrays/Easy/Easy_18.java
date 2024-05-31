package Assignment_Arrays.Easy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Easy_18 {
    public static void main(String[] args){
        // int[] num = {9,9,9,9,9,9,9,9,9,9,9};
        int[] num = {1,2,0,0};
        int k = 34;
        for(int item: addToArrayForm(num, k)){
            System.out.print(item+" ");
        }
    }

    static List<Integer> addToArrayForm(int[] num, int k){
            List<Integer> ans = new ArrayList<>();
            int finalAns = 0;
            if(num.length<10){
                for(int item: num){
                    finalAns = finalAns*10 + item;
                }
                finalAns = finalAns + k;
                while(finalAns>0){
                    int rem = finalAns % 10;
                    ans.add(0,rem);
                    finalAns = finalAns/10;
                }
                return ans;
            }else{
                int carry = k;
                int i = num.length-1;
                while(i>=0 || carry>0){
                    if(i>=0){
                        carry = carry + num[i];
                    }
                    ans.add(carry%10);
                    carry = carry/10;
                    i--;
                }
            }
            Collections.reverse(ans);
            return ans;
    }
}