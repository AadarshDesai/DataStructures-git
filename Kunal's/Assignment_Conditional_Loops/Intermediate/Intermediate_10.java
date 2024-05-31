package Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

//CGPA = (Percentage ÷ 9.5)
public class Intermediate_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total marks: ");
        int totalMarks = sc.nextInt();
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        double sum = 0;
        for(int i=1; i<=n; i++){
            System.out.print("Enter marks for subject "+i+": ");
            double marks = sc.nextDouble(); 
            sum += marks;
        }
        double Percentage = (sum/totalMarks)*100;
        System.out.println(Percentage);
        double CGPA = Percentage/9.5;

        System.out.println("Your CGPA is: "+CGPA);
        sc.close();
    }
}
