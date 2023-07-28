package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class OperationTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        operation(list, (n) -> n * 10);
    }
    public static void operation(List<Integer> list, IntFunction<Integer> function) {
        list.forEach(item -> {
            item = function.apply(item);
            System.out.println(item + " ");
        });

    }
}
