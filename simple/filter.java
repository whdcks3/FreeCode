package simple;

import java.util.Arrays;
import java.util.List;

public class filter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 10).forEach(n -> System.out.println((n)));
        long s = list.stream().map(String::length).count();
        System.out.println(s);
    }
}
