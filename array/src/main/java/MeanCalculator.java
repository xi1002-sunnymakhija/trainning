import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MeanCalculator {

    public static void main(String[] a) {
        List<String> words1 = Arrays.asList("Hello", "World");
        List<String[]> x = words1.stream().map(word -> word.split("")).distinct().collect(Collectors.toList());
        List<Stream<String>> collect = words1.stream().map(word -> word.split("")).map(Arrays::stream).distinct().collect(Collectors.toList());
        List<String> collect1 = words1.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        Stream<String[]> stream = words1.stream().map(word -> word.split(""));
        System.out.println(collect1);
    }
}
