import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class ConsecutiveSum {

    public static void main(String[] a) {

        int[] ar = new int[]{1, 2, 3, 4, 5, 6, 101, 102, 103, 104, 105};

        System.out.println(finConsecutiveSum(ar));

        int max = 0;
        for (int i = 0; i < ar.length - 1; i++) {

            int j = i;
            int cnt = 1;
            while (j != ar.length - 1 && (ar[j] + 1) == ar[j + 1]) {
                cnt++;
                j++;

            }
            i = j;
            if (cnt > max)
                max = cnt;
        }
        System.out.println(max);
    }

    private static int finConsecutiveSum(int[] ar) {
        Map map= new HashMap<Integer, Integer>();
        Arrays.asList(ar).stream().forEach(i->
        {
         map.put(i, i);
        });

        int max =0;
        for(int k=0;k<ar.length-1;k++) {
            if(!map.containsKey(ar[k]-1))
            {
                int num = ar[k];
                int longestSeq =1;
                while (map.containsKey(num)) {
                    num= num+1;
                    longestSeq++;
                }
                if(longestSeq > max)
                    max= longestSeq;
            }


        }
        return max;

    }
}
