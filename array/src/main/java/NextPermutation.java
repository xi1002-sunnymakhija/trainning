public class NextPermutation {

    public static void main(String[] a)
    {
        int[] nums= {2,3,1};
        nextPermutation(nums);
        for(int k=0;k<nums.length;k++)
        {
            System.out.print("("+nums[k]+","+nums[k+1]+","+nums[k+2]);
            break;
        }
    }

    private static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);

    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
