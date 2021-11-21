public class FindMissingAndDuplicate {
    public static void main(String[] a)
    {
        int[] ar= new int[]{1,2,2,4,5,6};
        printDuplicateMissing(ar, 6);
    }

    private static void printDuplicateMissing(int[] arr, int size) {
        int i;
        System.out.print("The repeating element is ");

        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }

        System.out.print("And the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }
}
