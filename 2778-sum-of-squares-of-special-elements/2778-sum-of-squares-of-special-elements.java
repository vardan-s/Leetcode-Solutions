class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=1,j=0;i<=nums.length;i++,j++)
        {
            if(n%i==0)
            sum=sum+(nums[j]*nums[j]);
        }
        return sum;
    }
}