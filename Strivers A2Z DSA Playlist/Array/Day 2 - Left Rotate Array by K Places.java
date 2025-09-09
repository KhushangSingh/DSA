// Left Rotate Array by K Places

class Solution {
    public static void rotateArray(int[] nums, int k) {
        
        if (nums == null || nums.length <= 1) return;

        k = k % nums.length;

        if (k == 0) return;

        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
