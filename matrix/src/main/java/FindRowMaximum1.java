public class FindRowMaximum1 {
    public static void main(String[] a) {
        int[][] arr = {
                {1, 1, 1, 0},
                {1, 1, 1, 0},
                {0, 0, 0, 0},
                {1,1,1,1}
        };
        searchElement(arr);
    }

    private static void searchElement(int[][] arr) {
        int c = arr[0].length;
        int r = arr.length;
        int count=0;
        int max=0;
        int row=0;
        for (int i = 0; i < r; i++) {
            count=0;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {

                   count++;
                   if(count> max)
                   {
                       max = count;
                       row = i;
                   }
                }
            }
        }
        System.out.println("maximum"+ row);
    }
}
