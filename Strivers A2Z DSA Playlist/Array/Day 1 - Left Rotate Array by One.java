// Left Rotate Array by One

class Solution {
    public void rotateArrayByOne(int[] nums) {

        int n = nums.length;

        if (nums == null || nums.length <= 1) {
            return;
        }

        int a = nums[0];

        for(int i=0; i<n-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[n-1] = a;
    }
}
