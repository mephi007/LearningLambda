package ImportantInterfaceExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SteamAPIExamples {

    public static void main(String[] args) {
        //filter example
        List<String> str = Arrays.asList("abc", "", "bc", "ac", "", "ab","");
        System.out.println("List of Strings with empty strings");
        Consumer<String> con = s -> System.out.println(s);
        str.forEach(l -> {
            con.accept(l);
        });
        System.out.println("using filter to collect non-empty strings");
        List<String> filtered = str.stream().filter(st -> !st.isEmpty()).collect(Collectors.toList());
        filtered.forEach(l ->{
            con.accept(l);
        });
    }
}