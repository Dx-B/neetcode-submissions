class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length-1;
        while (l <= r) {
            int middle = (l+r)/2;
            if (matrix[middle][0] > target) {
                r = middle-1;
            }
            else if (matrix[middle][matrix[middle].length-1] < target) {
                l = middle+1;
            }
            else {
                return Arrays.binarySearch(matrix[middle],target) >= 0;
            }
        }
        return false;
    }
}
