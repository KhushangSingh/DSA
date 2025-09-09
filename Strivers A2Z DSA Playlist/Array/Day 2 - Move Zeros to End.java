// Move Zeros to End

class Solution {
    public void moveZeroes(int[] nums) {
        
        if (nums == null || nums.length <= 1) {
            return;
        }

        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;

                insertPos++;
            }
        }
    }
}
