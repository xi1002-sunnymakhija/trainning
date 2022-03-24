import java.util.Arrays;

public class MoveNegativeOneSide {
    public static void main(String[] a) {
        int[] ar = new int[]{-1, 1, 0, 1, -1, 2, 3, -1};
        moveAside(ar);
    }

    private static void moveAside(int[] ar) {
        int mid=0;
        int high=ar.length-1;
        while (mid <= high) {
            if(ar[high] == -1)
            {
                high--;
            }
            else if(ar[mid] == -1 && ar[high] != -1)
            {
                int temp = ar[high];
                ar[high] = ar[mid];
                ar[mid] = temp;
                mid++;
                high--;
            }
            mid++;

        }
        Arrays.stream(ar).forEach(System.out::println);
    }
}
