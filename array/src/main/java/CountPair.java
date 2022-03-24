public class CountPair {

    public static void main(String[] a)
    {
        int[] nums={1,1,1,1};
        pairCount(nums,4,2);
    }

    private static void pairCount(int[] nums, int j, int k) {
        int count=0;
        for(int i=0;i<j;i++)
        {
            for(int m=i+1;m<j;m++)
            {
                if(nums[i]+nums[m]==k)
                {
                    count++;
                }
            }
        }

        System.out.println("Count is{}"+count);
    }
}
