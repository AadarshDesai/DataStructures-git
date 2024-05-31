package Lecture_Codes;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String dept = sc.next();
        sc.close();

        // switch(empId){
        //     case 1:
        //         System.out.println("Kunal Kushwaha");
        //         break;
        //     case 2: 
        //         System.out.println("Rahul Rana");
        //         break;
        //     case 3:
        //         System.out.println("Emp number 3");
        //         switch(dept){
        //             case "IT":
        //                 System.out.println("IT department");
        //                 break;
        //             case "Management":
        //                 System.out.println("management Department");
        //                 break;
        //             default:
        //                 System.out.println("Enter a valid department");
        //         }
        //         break;
        //     default:
        //         System.out.println("Enter a valid input");
        // }

        
        switch(empId){
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp number 3");
                switch(dept){
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("management Department");
                    default -> System.out.println("Enter a valid department");
                }
            }
            default -> System.out.println("Enter a valid input");  
        }

    }
}
