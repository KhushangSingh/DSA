// Second Largest Element

class Solution {
    public int secondLargestElement(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1;
        }

        int largest = nums[0];
        int secLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secLargest = largest;
                largest = num;
            } 

            else if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }

        if (secLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secLargest;
    }
}
