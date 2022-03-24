public class CountogousArray {
    public static void main(String[] a)
    {
        int[] arr={1,2,3,4,7,8};
        System.out.println(countContinousArray(arr));
    }

    private static int countContinousArray(int[] arr) {
        int[] temp= new int[arr.length];
        int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i>0 && arr[i]== arr[i-1]+1)
            {
                count++;
            }else
            {
                count = 1;
            }

            if(count> ans)
                ans= count;
        }
        return ans;

    }
}
