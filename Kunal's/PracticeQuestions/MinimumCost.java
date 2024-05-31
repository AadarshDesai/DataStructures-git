package PracticeQuestions;

public class MinimumCost {
    public static void main(String[] args){
        int[] positions = {1,1,4,5,5,8,9,10,10,10};
        System.out.println(minCostToMoveChips(positions));
    }

    public static int minCostToMoveChips(int[] positions){
        int odd = 0;
        int even = 0;
        for(int chips: positions){
            if(chips % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}
