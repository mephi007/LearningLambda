import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        //Before Java 8
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Comparator 1 : " + c1.compare(15,25));

        //Java 8

        Comparator<Integer> c2 = (a,  b) -> a.compareTo(b);
        System.out.println("Comparator 2 : " + c2.compare(25,20));
    }
}
