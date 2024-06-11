package Kunals.Assignment_Arrays.Easy;

public class Easy_04 {
    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1,9, 5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){
        int max = 0;
        for(int row=0; row<accounts.length; row++){
            int sum = 0;
            for(int col=0; col<accounts[row].length; col++){
                sum += accounts[row][col];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
