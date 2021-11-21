import java.util.HashSet;
import java.util.Set;

class FindDuplicate {
    // Function to print duplicates
    void printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
        int arr_size = arr.length;

        duplicate.printRepeating(arr, arr_size);

        printFirstRepeatingElement(arr, arr_size);

    }

    private static void printFirstRepeatingElement(int[] arr, int arr_size) {

        Set<Integer> integerSet= new HashSet<>();

        for(int i=0;i< arr_size-1;i++)
        {
            if(integerSet.contains(arr[i]))
            {
                System.out.println("Heell"+arr[i]);
                break;

            }
            else
            {
                integerSet.add(i);
            }
        }

    }
}
