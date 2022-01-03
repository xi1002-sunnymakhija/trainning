public class MaxSumContigousArrayKadane {
    public static void main(String[] a) {
        int[] ar = new int[]{1, 2, 3, -4, -1, -2, -3, 6, 2, 2};
        contigousSumArray(ar);
    }

    private static void contigousSumArray(int[] ar) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("maximum sum is {}" + max);
    }

}
