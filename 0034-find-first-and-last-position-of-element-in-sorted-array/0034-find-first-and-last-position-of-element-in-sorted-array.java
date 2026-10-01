class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
        {
            return new int[]{-1,-1};
        }
        int high=nums.length-1,low=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<target)
            {
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                int first=mid;
                int last=mid;
                int i=0;
                int j=mid-1;
                while(i<=j)
                {
                    int mid1=(i+j)/2;
                    if(nums[mid1]==target)
                    {
                        first=mid1;
                        j=mid1-1;
                    }
                    else
                    {
                        i=mid1+1;
                    }
                }
                i=mid+1;
                j=nums.length-1;
                while(i<=j)
                {
                    int mid1=(i+j)/2;
                    if(nums[mid1]==target)
                    {
                        last=mid1;
                        i=mid1+1;
                    }
                    else
                    {
                        j=mid1-1;
                    }
                }
                return new int[]{first,last};
            }
        }
        return new int[]{-1,-1};
    }
}