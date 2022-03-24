package demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
    public static void main(String[] a)
    {
        List<String> words= new ArrayList<>();
        words.add("Hello");
        words.add("world");
        List<String> collect = words.stream().map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect.size());
    }
}
