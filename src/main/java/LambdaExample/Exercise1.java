package LambdaExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Lewis", "Carroll", 42),
                new Person("Charles", "Dickens", 60),
                new Person("Thomas", "Caryle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39),
                new Person("Sumit", "Roy", 24)
        );

        Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
        printList(people, p -> true);
        System.out.println("Prints all people that have last name beginning with C");
        printList(people, p -> p.getLastName().startsWith("C"));
//        System.out.println(Arrays.deepToString(people));
    }

    private static void printList(List<Person> people, Condition condition) {
        for(Person p : people){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }

}