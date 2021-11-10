package ImportantInterfaceExamples;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biCon = (a,b) -> System.out.println("Add :" + (a+b));
        biCon.accept(5,6);
    }
}
