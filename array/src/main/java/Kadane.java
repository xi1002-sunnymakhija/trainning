public class Kadane {

    public static void main(String[] a)
    {
        int[] arr= new int[]{1,2,-1,-2,3,4};
        System.out.println(calculateSum(arr));
    }

    private static int calculateSum(int[] arr) {
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
}
