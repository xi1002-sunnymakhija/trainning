import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] a)
    {
        int[] ar= new int[]{1,2,3,4,8,9};
        reverseArray(ar);
        Arrays.stream(ar).forEach(System.out::println);
        //System.out.println("reversed array is "+ar);
    }

    private static void reverseArray(int[] ar) {
        int lastIndex= ar.length-1;
        for(int i=0;i<ar.length/2;i++)
        {
            int temp= ar[i];
            ar[i]=ar[lastIndex];
            ar[lastIndex]=temp;
            lastIndex--;
        }
    }

}
