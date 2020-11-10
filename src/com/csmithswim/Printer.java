package com.csmithswim;

//Functional interface, if there is a single abstract method then it is a functional interface
public interface Printer {
    //Abstract method
    void print(String message);
}


////Functional interface, if there is a single abstract method then it is a functional interface
//public interface Printer {
//    //Abstract method
//    void print(String message);
//
//    //default methods with implementations, this is frowned upon by Mosh
//    default void printTwice(String message){
//        System.out.println(message);
//        System.out.println(message);
//    }
//}
