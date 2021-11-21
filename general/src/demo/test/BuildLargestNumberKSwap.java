package demo.test;

public class BuildLargestNumberKSwap {
    public static void  main(String[] a)
    {
        String number="12349876";
        System.out.println(buildLargestNumberInSwap(number,3));
    }


    private static char[] buildLargestNumberInSwap(String s, int i) {
        char[] arr= s.toCharArray();
        for(int k=0; k<arr.length; k++)
        {
            char max=arr[k];
            int pos=1;
            for(int h=k+1; h<arr.length;h++)
            {
                if(arr[h]> max)
                {
                    max= arr[h];
                    pos=h;
                }
            }
            char temp = arr[k];
            arr[k]= arr[pos];
            arr[pos]= temp;
            i--;
            if(i ==0)
            {
                return arr;
            }
        }
        return arr;
    }
}
