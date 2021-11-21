import java.util.HashMap;

public class MaxSumSubArray {

    public static void main(String[] a)
    {
        int[] nums= new int[]{-5,1,0,-1,2,-1,5,-1,6};

        System.out.println(findSum(nums));
        System.out.println(findSum2(nums));
    }

    private static int findSum(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum = 0;

            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum> max){
                    max=sum;
                }
            }

        }
        return max;
    }

    private static int findSum2(int[] nums) {
        HashMap<String, String> map= new HashMap<>();
        int max=Integer.MIN_VALUE, sum=0;
        for(int i=0;i<nums.length;i++)
        {
          sum+= nums[i];
          if(sum> max)
          {
              max = sum;
          }
          if(sum<0)
          {
              sum=0;
          }
        }
        return max;
    }
}
