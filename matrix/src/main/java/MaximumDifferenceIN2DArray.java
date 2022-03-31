import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MaximumDifferenceIN2DArray {
    public static void main(String[] a){
        int[][] arr={{ 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 6, 1, 3 },
                { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 }};

        System.out.println(maxDifference(arr));
    }

    private static int maxDifference(int[][] arr) {
        int c = arr[0].length;
        int r = arr.length;
        ArrayList<Integer> lst=new ArrayList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                lst.add(arr[i][j]);
            }
        }
        Collections.sort(lst);
        return lst.get(lst.size()-1)- lst.get(0);
    }
}