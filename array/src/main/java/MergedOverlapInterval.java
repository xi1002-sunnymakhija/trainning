import java.util.Arrays;
import java.util.LinkedList;

public class MergedOverlapInterval {

    public static void main(String[] a)
    {
        int[][] arr= new int[][]{
                {1, 2},
                {4, 8},
                {7,10},
                {}
        };
        mergeOverlappdedInterval(arr);
    }

    private static void mergeOverlappdedInterval(int[][] arr) {
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> mergedList=new LinkedList<>();
        for(int[] intervals: arr)
        {
            if(mergedList.isEmpty() || mergedList.getLast()[1]< intervals[0])
            {
                mergedList.add(intervals);
            }
            else{
                mergedList.getLast()[1]=intervals[1];
            }
        }

        int[][] mergedInterval = mergedList.toArray(new int[mergedList.size()][]);
        for(int[] intervals: mergedInterval) {
            System.out.println("("+intervals[0]+","+intervals[1]+")");
        }


    }
}
