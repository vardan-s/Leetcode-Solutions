class Solution {
    public int trap(int[] height) {
        int low=0,high=height.length-1,lm=0,rm=0,calculate=0;
        while(low<=high)
        {
            if(height[low]<=height[high])
            {
                if(height[low]>=lm)
                lm=height[low];
                else
                calculate+=lm-height[low];
                low++;
            }
            else
            {
                if(height[high]>=rm)
                rm=height[high];
                else
                calculate+=rm-height[high];
                high--;
            }
        }
        return calculate;
    }
}