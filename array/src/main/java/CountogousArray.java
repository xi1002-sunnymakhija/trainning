import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CountogousArray {
    public static void main(String[] a)
    {
        int[] arr={1,1,2,3,4,7,8};
        System.out.println("hell"+countContinousArray(arr));

        System.out.println(countContinousOptimizeArray(arr));
    }

    private static int countContinousOptimizeArray(int[] arr) {
        int count=0;
        HashSet<Integer> st= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            st.add(arr[i]);

        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            count=0;
            if(!st.contains(arr[i]-1))
            {
                int j= arr[i];
                while(st.contains(j))
                {
                    j++;
                    count++;
                }


            }
            if(count>max)
                max=count;
        }
        return max;
    }

    private static int countContinousArray(int[] arr) {
        List<Integer> arLst= new ArrayList<>();

        int count=0;
        int ans=0;
        arLst.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] != arr[i-1])
            {
                arLst.add(arr[i]);
            }
        }
        for(int i=0;i<arLst.size();i++)
        {
            if(i>0 && arLst.get(i)== arLst.get(i-1)+1)
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
