// Maximum Consecutive Ones

class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        
        if(nums.length == 0) return -1;

        int n = nums.length;
        int count = 0;
        int c = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] == 1) {
                c++; 
            } else {
                if(c > count) {
                    count = c;
                    c= 0;
                } 
            }
        }
        return count;
    }
}
