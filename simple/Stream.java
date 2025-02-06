package simple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> num1 = Arrays.asList(5, 3, 3, 1, 4, 5, 2);
        List<Integer> num2 = Arrays.asList(5, 3, 3, 1, 4, 5, 2);
        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<Integer> num3 = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 10).forEach(n -> System.out.println((n)));
        List<Integer> Streamnum1 = num1.stream().distinct().sorted().collect(Collectors.toList());
        long s = list.stream().map(String::length).count();
        List<Integer> Streamnum = num.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
        List<Integer> Streamnum2 = num2.stream().skip(2).limit(3).collect(Collectors.toList());
        long s1 = list1.stream().count();
        int s2 = num3.stream().reduce(0, Integer::sum);

        System.out.println(Streamnum2);
        System.out.println(Streamnum1);
        System.out.println(Streamnum);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
