import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericTest {
    public static void main(String[] a)
    {
        int[] aer={1,2,3};
        List ints = Arrays.stream(aer).boxed().collect(Collectors.toList());
        List nums= ints;
        nums.add(3.19);
    }
}
