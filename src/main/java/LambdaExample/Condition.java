package LambdaExample;

@FunctionalInterface
public interface Condition {

    boolean test(Person p);
}
