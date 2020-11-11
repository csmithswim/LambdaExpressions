Functional interface - an interface with a single abstract method.

Comparable and comparator interface are both functional interfaces.

Lambda expression - anonymous function we can pass around.

Lambda expressions are essentially objects that can be used to represent anonymous functions.

In lambda expressions, the keyword this references the enclosing object whereas in anonymous inner classes, this 
references the current instance of the anonymous inner class and other difference between these two
types is that the anonymous inner classes can have state so, they can have field to store some data in. 
In lambda expressions we cannot have fields.

Method references allow lambda expressions to be more compact and easier to read.

Java.util.function is the package that has predefined functional interfaces.

There are four types of functional interfaces in Java: consumer, supplier, function and predicate.

Consumer interface - represents an operation that takes a single argument and returns no result. The print method in this package is similar to this.
void consume(obj)

BiConsumer and IntConsumer are commonly used.

Supplier interface is the opposite of the consumer interface, it represents an operation that takes no input and returns a value. It supplies a value.

Supplier interfaces also have other interfaces that work with primitive values.

obj supply()

Function interface represents a function that can map a value to a different value.

It represents an operation that returns a value. T(type of argument) and R(type of the result).

Function interfaces have four methods, one of which is abstract.

BiFunction<T, U, R> takes two arguments and returns a result.

IntFunction represents a function that takes a primitive integer. There is LongFunction, DoubleFunction.

ToIntFunction has its argument parameterised, and the return is a primitive.

IntToLong takes a primitive integer and returns a primitive long.

Predicate interface - takes an object and checks to see if the object satisfies some criteria. It is used to filter data. 

Predicate helps filter data. Has a single abstract method of test.

BiPredicate takes two arguments and returns a boolean.

IntPredicate, LongPredicate, etc.

BinaryOperator interface is a special type of function, there are primitive specializations of the interface too.





