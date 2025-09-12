// Leaders in an Array

// Optimal Approach

class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;
        int max = nums[n-1];
        for(int i=n-1; i>=0; i--) {
            if(nums[i] >= max) {
                max = nums[i];
                result.add(0,max);
            }
        }
        return result;
    }
}
