import java.util.Arrays;

public class RotateArrayByOne {
    public static void main(String[] a)
    {
        int[] ar= new int[]{1,2,3,4,5};
        rotateArrayCyclicByOne(ar);
    }

    private static void rotateArrayCyclicByOne(int[] ar) {
        int last = ar[ar.length-1];
        int lastIndex= ar.length-1;
        while(lastIndex > 0)
        {
            ar[lastIndex] = ar[lastIndex-1];
            lastIndex --;
        }
        ar[0] = last;

        Arrays.stream(ar).forEach(System.out::println);

    }
}
