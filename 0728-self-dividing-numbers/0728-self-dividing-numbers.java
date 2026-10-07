class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        int count=1;
        int nums;
        for(int i=left;i<=right;i++)
        {
            nums=i;
            count=1;
            while(nums>0)
            {
                int d=nums%10;
                if(d==0 || i%d!=0)
                {
                    count=0;
                    break;
                }
                nums=nums/10;
            }
            if(count==1)
            {
                ans.add(i);
            }

        }
        return ans;
    }
}