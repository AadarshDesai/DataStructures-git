package Kunals.Lecture_Codes;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Aadarsh Desai");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
