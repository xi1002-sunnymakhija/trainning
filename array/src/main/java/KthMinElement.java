import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KthMinElement {
    public static void main(String[] a)
    {
        int[] ar= new int[]{2,3,5,6,7,8,9,0,3,1,1};//01123356789
        TreeMap intMap= new TreeMap();
        for(int i=0;i<ar.length;i++)
        {
            if(intMap.containsKey(ar[i]))
            {
                int val = (int)intMap.get(ar[i]);
                intMap.put(ar[i], val+1);
            }else {
                intMap.put(ar[i], 1);
            }
        }

        findKthMin(intMap,5);

    }

    private static void findKthMin(TreeMap<Integer, Integer> intMap, int i) {
        int freq=0;
        for(Map.Entry<Integer, Integer> en : intMap.entrySet()){
            freq += en.getValue();

            if(freq>=i)
            {
                System.out.println("Kth min value is {}"+ en.getKey());
                return;
            }
        }
    }
}
///need min heap and maxheap