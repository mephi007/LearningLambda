package ImportantInterfaceExamples;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {

    public static void main(String[] args) {
        Consumer<String> con1 = (s) -> System.out.println(s.toUpperCase());
        con1.accept("sumit");
        Consumer<String> con2 = (s) -> System.out.println(s.toLowerCase());
        con2.accept("SUMIT");
        con1.andThen(con2).accept("Sumit Roy");
    }
}
