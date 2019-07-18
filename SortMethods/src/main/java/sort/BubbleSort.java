package sort;

import java.util.Arrays;

/**
 * BubbleSort
 * 
 * S
 */
public class BubbleSort {

    public int[] Sort(int[] nums) {
        if (nums == null) {
            return null;
        }
        int[] nums0 = Arrays.copyOf(nums, nums.length);
        int temp = 0;
        for (int i = 0; i < nums0.length; i++) {
            for (int j = nums0.length; j > i; j--) {
                if (nums0[j] < nums0[i]) {
                    temp = nums0[i];
                    nums0[i] = nums0[j];
                    nums0[j] = temp;
                }
            }
        }
        return nums0;
    }

    public void testBubbleSort() {

    }
}