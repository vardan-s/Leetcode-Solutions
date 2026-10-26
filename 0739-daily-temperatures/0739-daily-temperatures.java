class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(0);

        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && nums[i]>nums[st.peek()])
            {
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}