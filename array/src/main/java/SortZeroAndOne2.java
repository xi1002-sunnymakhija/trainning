import java.util.concurrent.Callable;

public class SortZeroAndOne2 {
    public static void main(String[] a)
    {
        int[] ar = new int[]{1,0,1,0};

        int i=0;
        int mid= ar.length-1;
        while(i<mid)
        {
            if(ar[mid]== 0)
            {
                int temp= ar[i];
                ar[i] = ar[mid];
                ar[mid]= temp;
                i++;
                mid--;
            }
            i++;
        }

        for(int j=0;j<ar.length;j++)
            System.out.println(ar[j]);

    }
}
