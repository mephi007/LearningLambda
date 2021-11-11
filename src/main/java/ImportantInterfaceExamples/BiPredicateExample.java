package ImportantInterfaceExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(10, 20, 30);
        List<Integer> l2 = Arrays.asList(10,20, 30);
        BiPredicate<List<Integer>, List<Integer>> biPredicate = (list1, list2) -> list1.size() == list2.size();
        System.out.println(biPredicate.test(l1,l2));
    }
}
