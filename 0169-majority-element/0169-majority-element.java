class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count,max=0,val=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            count=1;
            while(i+1<nums.length && nums[i]==nums[i+1])
            {
                count++;
                i++;

            }
            
            if(count>max){
                max=count;
            val=nums[i];
            }
        }
        return val;
    }
}