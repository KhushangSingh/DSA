// Search in a 2D matrix

// 1.  Brute Force Approach

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(target==mat[i][j]) return true ;
            }
        }
        return false;
    }
}

// 2. Optimal Solution - using Binary Search by assuming 2D array as 1D array 

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0, high = n*m-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;
            if (mat[row][col] == target) return true;
            else if (mat[row][col] < target) low = mid + 1;
            else high = mid-1;
        }
        return false;
    }
}
