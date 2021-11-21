import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class Java8Test {
    public static void main(String[] a)
    {

        List<Integer> listI= new ArrayList<>();
        listI.add(1);
        listI.add(2);
        listI.add(3);
        listI.add(4);
        listI.add(5);
        listI.add(6);
        List<Integer> collect = listI.stream().sorted().collect(Collectors.toList());
    }
}

class Employee
{

    private String id;
    String name;

}

class Person extends Employee{

    private String id;


}
