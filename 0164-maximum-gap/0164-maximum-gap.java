class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
        return 0;
        Arrays.sort(nums);
        int sub=0,max=0;
        for(int i=1;i<nums.length;i++)
        {
            
            sub=nums[i]-nums[i-1];
            max=Math.max(max,sub);
        }
        return max;

    }
}