package lambdas;


import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };

        var result = intBinaryOperator.applyAsInt(20, 30);

       Runnable hello_world = () -> System.out.println("Hello World!");

       Consumer<String> stringConsumer = (String string) -> System.out.println(string);

       Supplier<Double> doubleSupplier = () -> 3.1415;

    }
}
