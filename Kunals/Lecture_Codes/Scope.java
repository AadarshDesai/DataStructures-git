package Kunals.Lecture_Codes;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // int c = 10;
        String name = "Aadarsh"; //Strings referes to the same object
        {
            // int a = 90; //already initialised the block in the same method, hence you cannot initialise again.
            int c = 99;
            System.out.println(c);
            name = "Aadarsh Desai";
            a=90;
            System.out.println(name); //Strings referes to the same object
            // value initialised in this block, will remain in block.
        }
        int c = 10; // but you can initialise the variable after the block is over under same method.
        System.out.println(c); // cannot use outside block.
        System.out.println(a);
        System.out.println(b);
        System.out.println(name); //Strings referes to the same object


        //Scoping in for loop

        for(int i =0; i<10;i++){
            System.out.println(i);
        }
        // System.out.println(i); //i's scope is not outside the for loop
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
