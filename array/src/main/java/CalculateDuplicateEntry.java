import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class CalculateDuplicateEntry {
    final int x=0;

    public static void main(String[] a) {



        int[] nums = new int[]{1, 2, 3, 4, 5, 5};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {

        //List ints= Arrays.asList(1,2);


        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
