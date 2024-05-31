package Lecture_Codes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(67);
        // list.add(234);
        // list.add(52);
        // list.add(6547);
        // list.add(654);
        // list.add(75);
        // list.add(87);
        
        // System.out.println(list.contains(78979));
        // System.out.println(list);
        // list.set(0, 99);
        // list.remove(2);
        // System.out.println(list);

        //input
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }

        for(int i=0; i<5; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        sc.close();
        System.out.println(list);
    }
}
