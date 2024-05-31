package Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

/*

 Depreciation per year = (Asset Cost - Salvage Value) / Useful life

 */
public class Intermediate_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Asset Cost: ");
        int assetCost = sc.nextInt();
        System.out.print("Enter Salvage Value: ");
        int salvageValue = sc.nextInt();
        System.out.print("Enter Depreciation Year: ");
        int depreciationYear = sc.nextInt();
        sc.close();

        System.out.println("Depreciation per year is: "+(assetCost - salvageValue)/depreciationYear);
    }
}
