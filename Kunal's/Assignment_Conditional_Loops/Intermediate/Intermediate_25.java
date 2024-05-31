package Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int augustDays = 31;
        sc.close();

        int count = 0;
        for(int i=1; i<=augustDays; i++){
            if(i%2 == 0){
                count += 1;
            }
        }
        System.out.println("Kunal can only go out with friends for "+count+" days in August!");
    }
}
