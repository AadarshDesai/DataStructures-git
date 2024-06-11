package Kunals.PracticeQuestions;

public class MaximumPopulation {
    public static void main(String[] args){
       int[][] logs = {
            {1950, 1961},
            {1960, 1971},
            {1970, 1981}
       };
       System.out.println(maximumPopulation(logs));
    }

    public static int maximumPopulation(int[][] logs){
        int[] arr = new int[101];
        for(int[] log: logs){
            int birthYear = log[0];
            int deathYear = log[1];
            arr[birthYear-1950]++;
            arr[deathYear-1950]--;
        }

        int max = arr[0];
        int maxYear = 1950;
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
            if(max < arr[i]){
                max = arr[i];
                maxYear = i+1950;
            }
        }
        return maxYear;
    }
}
