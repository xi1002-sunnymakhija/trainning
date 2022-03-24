import java.util.HashMap;
import java.util.Map;

public class CountPairSum {
    public static void main(String[] a)
    {
        int sum =5;
        int[] arr={1,2,3,4,1,0,2};

        System.out.println(countPair(arr, sum));

    }

    private static int countPair(int[] arr, int sum) {
        int count=0;
        Map<Integer,Integer> m= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(m.containsKey(sum-arr[i]))
            {
                count=count+ m.get(sum-arr[i]);
            }

            if(m.containsKey(arr[i]))
            {
                m.put(arr[i], m.get(arr[i])+1);
            }else
            {
                m.put(arr[i], 1);

            }
        }
        return count;
    }
}
