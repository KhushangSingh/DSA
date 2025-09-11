// Single Number - 1

// 1. Brute-Force Approach

class Solution {
    public int singleNumber(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int count=0;
            for (int j=0; j<nums.length; j++) {
                if (nums[i]==nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}

// 2. Using in-built osrt method

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}

// 3. Using XOR Logic - Optimal Approach

class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for (int i = 0; i<nums.length; i++) {
            xor = xor^nums[i];
        }
        return xor;
    }
}
