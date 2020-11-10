package com.csmithswim;

public class LambdasDemo {
    public String prefix = "-";

    //Can access the variable as a static field
    public static String prefix = "-";

    public  void show() {
        //Can access local variables
        String prefix = "-";

        greet(message -> System.out.println(prefix + message));

        //Lambda expression, we pass the implementation of the interface method as an anonymous function
        // -> Is the lambda operator, {} is the body of the function
        //No need to put the datatype in the parameter, parentheses can be removed when there is just one parameter and no need for
        // {} if there is just one line in the body
        greet(message -> System.out.println(message));

        //Lambda expressions can be stored in a variable
        Printer printer = message -> System.out.println(message);

        //instance of an anonymous inter-class, it has no name and is being used inside a method
        greet(new Printer() {
            @Override
            public void print(String message) {

            }
        });
    }

    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}

//public class LambdasDemo {
//    public String prefix = "-";
//
//    //Can access the variable as a static field
//    public static String prefix = "-";
//
//    public  void show() {
//        //Can access local variables
//        String prefix = "-";
//
//        greet(message -> System.out.println(prefix + message));
//
//        //Lambda expression, we pass the implementation of the interface method as an anonymous function
//        // -> Is the lambda operator, {} is the body of the function
//        //No need to put the datatype in the parameter, parentheses can be removed when there is just one parameter and no need for
//        // {} if there is just one line in the body
//        greet(message -> System.out.println(message));
//
//        //Lambda expressions can be stored in a variable
//        Printer printer = message -> System.out.println(message);
//
//        //instance of an anonymous inter-class, it has no name and is being used inside a method
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//
//            }
//        });
//    }
//
//    public static void greet(Printer printer){
//        printer.print("Hello World");
//    }
//}
