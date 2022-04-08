import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

public class ConsecutiveSum {

    public static void main(String[] a) {
        Function

        int[] ar = new int[]{1, 2, 3, 4, 5, 6, 101, 102, 104, 105};

        System.out.println(finConsecutiveSum(ar));

        int max = 0;
        for (int i = 0; i < ar.length - 1; i++) {

            int j = i;
            int cnt = ar[j];
            while (j != ar.length - 1 && (ar[j] + 1) == ar[j + 1]) {
                //cnt++;
                j++;
                cnt= cnt+ar[j];

            }
            i = j;
            if (cnt > max)
                max = cnt;
        }
        System.out.println("maximum sum is {}"+max);
    }

    private static int finConsecutiveSum(int[] ar) {
        Map<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int m=0;m<ar.length;m++)
        {
            map.put(ar[m],ar[m]);
        }


        int max =0;
        for(int k=0;k<ar.length-1;k++) {
            if(!map.containsKey(ar[k]-1))
            {
                int num = ar[k];
                int longestSeq =0;
                while (map.containsKey(num)) {

                    longestSeq= longestSeq+num;
                    num= num+1;
                }
                if(longestSeq > max)
                    max= longestSeq;
            }


        }
        return max;

    }
}
