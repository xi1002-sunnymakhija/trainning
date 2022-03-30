public class RootenOranges {

    public static void main(String[] a) {
        int[][] arr = {
                {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}
        };
        System.out.println(rottenOranges(arr));
    }

    private static int rottenOranges(int[][] arr) {
        int c = arr[0].length;
        int r = arr.length;
        int count =0;
        int flag=0;
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
               if(arr[i][j] ==2)
               {
                   if(isSafeCordinate(i,j+1,c, r) && arr[i][j+1]==1)
                   {
                        arr[i][j+1]=2;
                        flag=1;
                   }
                   if(isSafeCordinate(i,j-1,c, r) && arr[i][j-1]==1)
                   {
                       arr[i][j-1]=2;
                       flag=1;
                   }
                   if(isSafeCordinate(i-1,j,c, r) && arr[i-1][j]==1)
                   {
                       arr[i-1][j]=2;
                       flag=1;
                   }
                   if(isSafeCordinate(i+1,j,c, r) && arr[i+1][j]==1)
                   {
                       arr[i+1][j]=2;
                       flag=1;
                   }
               }
            }
            count++;
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                if(arr[i][j] == 1)
                {
                    return -1;
                }
            }
        }
        return count-1;
    }

    private static boolean isSafeCordinate(int i, int j, int c, int r) {
        if(i>=0 && j>= 0 && i<r && j<c)
        {
            return true;
        }
        return false;
    }
}