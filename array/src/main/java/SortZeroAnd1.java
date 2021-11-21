import java.util.Arrays;

public class SortZeroAnd1 {
    public static void main(String[] a)
    {
        int[] ar = new int[]{1,0,1,2,0,4,1,1,2,2};
        int mid=0;
        int i=0;
        int high = ar.length-1;
        while(mid<=high){
                if(ar[mid] == 0)
                {
                    int temp = ar[i];
                    ar[i] = ar[mid];
                    ar[mid]= temp;
                    i++;
                    mid++;
                }
                else if(ar[mid] == 1)
                {
                    mid++;
                }

                else if(ar[mid] == 2)
                {
                    int temp = ar[high];
                    ar[high] = ar[mid];
                    ar[mid]= temp;
                    high--;
                }
        }

        Arrays.asList(ar).forEach(System.out::println);

    }
}
