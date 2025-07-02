package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");
        // for (String string : strings) {
        // System.out.println(string);
        // }
        // strings.stream().forEach(s -> System.out.println(s));

        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        // List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        // ints.add(Integer.parseInt(string));
        // }
        // System.out.println(ints);
        List<Integer> ints = strings2.stream()
                // .map(s -> Integer.parseInt(s))
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        Integer finalNumber = ints.stream()
                // .reduce((t, v) -> t + v)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
