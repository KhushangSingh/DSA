// Check if the Array is Sorted II

class Solution {
    public static boolean isSorted(ArrayList<Integer> nums) {  
        for (int i=0; i < nums.size()-1; i++) {
            if (nums.get(i) > nums.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
