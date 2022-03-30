public class MinimumNumberStep {

    static int minJumps(int arr[], int l, int h)
    {
        // Base case: when source
        // and destination are same
        if (h == l)
            return 0;

        // When nothing is reachable
        // from the given source
        if (arr[l] == 0)
            return Integer.MAX_VALUE;

        // Traverse through all the points
        // reachable from arr[l]. Recursively
        // get the minimum number of jumps
        // needed to reach arr[h] from these
        // reachable points.
        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h
                && i <= l + arr[l];
             i++) {
            int jumps = minJumps(arr, i, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }

    static int minJumps2(int[] arr, int n)
    {
        int maxR=arr[0];
        int step=arr[0];
        int jump=1;

        if(n==0)
        {
            return 1;
        }else if(arr[0] == 0) return -1;
        else{
            for(int i=0;i<n;i++)
            {
                if(i== n-1)
                {
                    return jump;
                }
                maxR = Integer.max(maxR, i+arr[i]);
                step--;
                if(step==0) {
                    jump++;
                    if (i >= maxR) {
                        return -1;
                    }
                    step = maxR - i;
                }
                }
            }
        return jump;

    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        int n = arr.length;
//        System.out.print("Minimum number of jumps to reach end is "
//                + minJumps(arr, 0, n - 1));

        System.out.print("Minimum number of jumps to reach end is "
                + minJumps2(arr,n - 1));
    }

}
