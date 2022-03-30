import java.util.HashMap;

public class CommonElementInThreeSortedArray {

    public static void main(String[] a)
    {
        int[] arr1={1,1,2,3,3,4,4,5};
        int[] arr2={3,3,4,5};
        int[] arr3={4,4,5,5,6};
        findCommonElement(arr1,arr2,arr3);

    }

    private static void findCommonElement(int[] arr1, int[] arr2, int[] arr3) {

        HashMap<Integer, Integer> mp= new HashMap<>();
        int k=1;
        removeDuplicate(arr1, arr2, arr3);
        for(int i=0;i<arr1.length;i++)
        {
            mp.put(arr1[i],k);
        }
        int flag=0;
        for(int i=0;i<arr2.length&&k<arr3.length; i++,k++)
        {
            if(mp.containsKey(arr2[i]) && mp.containsKey(arr3[k]))
            {
                System.out.println("commom element is "+ arr2[i]);
            }
        }


    }

    private static void removeDuplicate(int[] arr1, int[] arr2, int[] arr3) {
        int res1=1;
        for(int i=1;i<arr1.length;i++)
        {
            if(arr1[i] != arr1[res1-1])
            {
                arr1[res1] = arr1[i];
                res1++;
            }
        }

        int res2=1;
        for(int i=1;i<arr2.length;i++)
        {
            if(arr2[i] != arr2[res2-1])
            {
                arr2[res2] = arr2[i];
                res2++;
            }
        }

        int res3=1;
        for(int i=1;i<arr3.length;i++)
        {
            if(arr3[i] != arr3[res3-1])
            {
                arr3[res3] = arr3[i];
                res3++;
            }
        }
    }
}
