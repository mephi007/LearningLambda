package ImportantInterfaceExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiConsumerInterfaceExample {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biCon = (a,b) -> System.out.println("Add :" + (a+b));
        biCon.accept(5,6);
    }
}
