class Solution {
    public String reverseWords(String s) {
        String p="";
        int low=0,i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                i++;

            }
            else
            {
                int j=i-1;
                while(j>=low)
                {
                    p=p+s.charAt(j);
                    j--;
                }
                p=p+" ";
                i++;
                low=i;
            }
        }
        int j=s.length()-1;
        while(j>=low)
        {
            p=p+s.charAt(j);
            j--;
        }
        return p;
    }
}