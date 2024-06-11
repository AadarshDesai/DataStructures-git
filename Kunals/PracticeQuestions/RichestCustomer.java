package Kunals.PracticeQuestions;

public class RichestCustomer {
    public static void main(String[] args){
        int[][] accounts = {
            {1,2,3},
            {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){
        int maxWealth = 0;
        for(int row=0; row<accounts.length; row++){
            int sum = 0;
            for(int col=0; col<accounts[row].length; col++){
                sum += accounts[row][col];
            }
            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
