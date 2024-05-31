package Lecture_Codes;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String fruit = sc.next();
        int day = sc.nextInt();
        sc.close();


        //Enhanced switch case without break statement.
        // switch(fruit){
        //     case "Apple" -> System.out.println("A sweet red fruit");
        //     case "Mango" -> System.out.println("King of all fruits");
        //     case "Orange" -> System.out.println("A round fruit");
        //     case "Avocado" -> System.out.println("A healthy and expensive fruit");
        //     case "Grapes" -> System.out.println("A small fruit");
        //     default -> System.out.println("Please enter a valid input.");
        // }


        //Another good use of enhanced switch case.
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid input!");
        }
    }
}
