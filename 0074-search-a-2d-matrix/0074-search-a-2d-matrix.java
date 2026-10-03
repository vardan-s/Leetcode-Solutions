class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nr=matrix.length;
        int nc=matrix[0].length;
        int low=0;
        int high=(nr*nc)-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int row=mid/nc;
            int col=mid%nc;
            if(matrix[row][col]<target)
            {
                low=mid+1;
            }
            else if(matrix[row][col]>target)
            {
                high=mid-1;
            }
            else
            {
                return true;

            }
        }
        return false;

    }
}