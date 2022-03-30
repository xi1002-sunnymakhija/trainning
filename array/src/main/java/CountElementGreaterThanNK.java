import java.util.HashMap;
import java.util.Map;

public class CountElementGreaterThanNK {

    public static void main(String[] a)
    {
        int[] arr= {1,1,1,1,2,2,2,2,3,3,3,4,4,4,4};
        int k=4;
        System.out.println(calculateEntry(arr, 15, k));
    }

    private static int calculateEntry(int[] arr, int n, int k) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        //Integer.MA

        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        int temp=n/k;
        int count=0;
        for(Map.Entry ent:mp.entrySet())
        {
            if((Integer)ent.getValue() > temp)
            {
                count++;
            }
        }
        return count;
    }
}
