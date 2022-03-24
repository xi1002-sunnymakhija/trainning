public class MoveNegative {

    public static void main(String[] a)
    {
        int[] arr= new int[]{1,-1,2,-2,3,-3};
        movenegative(arr);

    }

    private static void movenegative(int[] arr) {
        int mid= 0;
        int high = arr.length-1;
        while(mid <= high)
        {
            if(arr[mid]>=0 && arr[high]<0)
            {
                mid++;
                high--;
            }else if(arr[mid]<0 && arr[high]>=0)
            {
                int temp= arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                mid++;
                high--;
            }
        }

        for(int k=0;k<arr.length;k++)
            System.out.println(arr[k]);

    }
}
