public class SerachElement2DMatrix {
    public static void main(String[] a)
    {
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        searchElement(arr,7);
    }

    private static void searchElement(int[][] arr, int k) {
        int c= arr[0].length;
        int r= arr.length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j] == k)
                {
                    System.out.println("Element found at :("+i+ ","+j+")");
                }
            }
        }
    }
}
