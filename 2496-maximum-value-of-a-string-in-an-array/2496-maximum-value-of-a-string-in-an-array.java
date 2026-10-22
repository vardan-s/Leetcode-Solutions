class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(int i =0;i<strs.length;i++)
        {
            int count=0;
            boolean digit=true;
            for(int j=0;j<strs[i].length();j++)
            {
                char ch=strs[i].charAt(j);
                if(ch<'0' || ch>'9')
                {
                    digit=false;
                    break;
                }
            }
            if(digit)
            {
                count=Integer.parseInt(strs[i]);
            }
            else
            {
                count=strs[i].length();
            }
            max=Math.max(max,count);
        }
        return max;
    }
}