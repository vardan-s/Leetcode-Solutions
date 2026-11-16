class Solution {
    public boolean checkRecord(String s) {
        int count1=0,count2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                count1++;
            }
            else if(s.charAt(i)=='L')
            {
                if(i+2<s.length())
                {
                    if(s.charAt(i+1)=='L' && s.charAt(i+2)=='L')
                    {
                        return false;
                    }
                }
            }
        }
        if(count1<2)
        {
            return true;
        }
        return false;
    }
}