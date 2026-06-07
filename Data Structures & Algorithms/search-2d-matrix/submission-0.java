class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[matrix.length-1][matrix[0].length-1] < target) {
            return false;
        }
        for (int i = matrix.length-1; i >= 0; i--) {
            if (matrix[i][0] > target) {
                continue;
            }
            return Arrays.binarySearch(matrix[i],target) >= 0 ? true : false;
        }
        return false;
    }
}
