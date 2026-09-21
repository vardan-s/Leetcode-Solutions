class Solution {
    public int maxArea(int[] nums) {
        int high=nums.length-1,low=0,max=0,prod=1;
        while(low<high)
        {
            int dif=(high+1)-(low+1);
            if(nums[low]<nums[high])
            {

                prod=nums[low]*dif;
                low++;

            }
            else if(nums[low]>nums[high])
            {
                prod=nums[high]*dif;
                high--;
            }
            else if(nums[low]==nums[high])
            {
                prod=nums[low]*dif;
                high--;
                low++;
            }
            max=Math.max(max,prod);

        }
    return max;
    }
}