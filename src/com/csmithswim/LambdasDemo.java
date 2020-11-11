package com.csmithswim;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {
    //UnaryOperator Interface
    public static void show() {
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n +1;

        var result = increment.andThen(square).apply(1);
        System.out.println(result);
    }


//    //BinaryOperator Interface
//    public static void show() {
//        //a, b -> a + b -> square
//        BinaryOperator<Integer> add = (a, b) -> a + b;
//        Function<Integer, Integer> square = a -> a * a;
//        var result = add.andThen(square).apply(1,2);
//
//
//
//        //More efficient to use the IntBinaryOperator
//        BinaryOperator<Integer> add = (a, b) -> a + b;
//        var result = add.apply(1,2);
//    }
}

//    //Combining Predicate interfaces
//    public static void show() {
//        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
//        Predicate<String> hasRightBrace = str -> str.startsWith("}");
//
//    Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
//    var result=  hasLeftAndRightBraces.test("{key:value}");
//
//    //Negate method does the opposite of what the predicate method does
//    hasLeftBrace.negate();
//    }
//}

//    //Predicate interface
//    public static void show() {
//        Predicate<String> isLongerThan5 = str -> str.length() >5;
//        isLongerThan5.test("sky");
//    }
//}


//    //Composing Functions
//    public static void show() {
//    //"key:value"
//    //first: "key=value"
//    //second: "{key=value}"
//    Function<String, String> replaceColon = str -> str.replace(":", "=");
//    Function<String, String> addBraces = str -> "{" + str + "}";
//
//    //There are two ways to compose functions. Declarative Programming
//    var result = replaceColon
//                            .andThen(addBraces)
//                            .apply("key:value");
//
//    //The compose method is similar to andThen but chains them in the reverse order.
//    result = addBraces.compose(replaceColon).apply("key:value");
//
//    System.out.println(result);
//    }
//}


//Example of function interface
//    public static void show() {
//        Function<String, Integer> map = str -> str.length();
//        var length = map.apply("sky");
//        System.out.println(length);
//    }
//}


    //Examples of supplier interfaces
//    public static void show() {
//        Supplier<Double> getRandom = () -> Math.random();
//        //The Math.random() function is not run until we call it, something known as lazy evaluation
//        var random = getRandom.get();
//        System.out.println(random);
//    }
//}

    //Examples of the consumer interface
//    public static void show() {
//        List<String> list = List.of("a", "b", "c");
//        Consumer<String> print = item -> System.out.println(item);
//        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//
//        list.forEach(print.andThen(printUpperCase));
//    }
//}
//        List<Integer> list = List.of(1, 2, 3);
//
//        //One way to iterate, type of imperative programming (for, if/else, switch/case), i.e. how stuff needs to be done
//        for (var item : list)
//            System.out.println(item);
//
//        //Using a lambda expression to iterate through, an example of declarative programming, i.e. what needs to be done
//        list.forEach(item -> System.out.println(item));
//}

    //Using constructor
//    public LambdasDemo(String message){
//    }
//
//    public static void show() {
//        greet(message -> new LambdasDemo(message));
//        greet(LambdasDemo::new);
//    }
//
//    public static void greet(Printer printer){
//        printer.print("Hello World");
//    }
//
//

    //Using instance method
//    public void void print(String message){}
//
//    public  void show() {
//   var demo = new LambdasDemo();
//   greet(message -> demo.print(message));
//   greet(demo::print);
//    }
//
//    public static void greet(Printer printer){
//        printer.print("Hello World");
//    }

    //Using static method
//    public static void print(String message){}
//
//    public  void show() {
//        greet(message -> print(message));
//        greet(LambdasDemo::print);
//    }
//
//    public static void greet(Printer printer){
//        printer.print("Hello World");
//    }
}

//    greet(message -> System.out.println(message));
//
//        //Sometimes it's easier to reference the method directly
//        // Class/Object::method
//        //IntelliJ can convert it to method reference by highlighting and doing alt+enter
//        //We can reference static or instance methods and constructors in a class
//        greet(System.out::println);
//    }
//
//    public static void greet(Printer printer){
//        printer.print("Hello World");
//    }
//}

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
