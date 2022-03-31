public class RotateMatrix {
    public static void main(String[] a) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateMatrix(arr, arr.length, arr[0].length);
    }

    private static void rotateMatrix(int[][] arr, int rows, int colums) {
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < colums; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        for (int i = 0; i < arr[0].length; i++)
            for (int j = 0, k = arr[0].length - 1; j < k;
                 j++, k--) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }

        System.out.println("arr []"+ arr);
    }
}