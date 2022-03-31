import java.util.Arrays;
import java.util.HashMap;

public class CommonRowWise {
    public static void main(String[] a) {
        int[][] arr = {
                {1, 2, 4},
                {2, 3, 4},
                {4, 5, 2}
        };

        findCommon(arr);

    }

    private static void findCommon(int[][] arr) {
        int c = arr[0].length;
        int r = arr.length;
        int count = 0;
        int flag = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr[0].length; i++) {
            mp.put(arr[0][i], 1);
        }

        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mp.get(arr[i][j]) != null && mp.get(arr[i][j]) == i) {
                    mp.put(arr[i][j], mp.get(arr[i][j]) + 1);
                    if (i == r - 1) {
                        System.out.println(" [" + arr[i][j] + "]");
                    }
                }
            }
        }
    }
}


