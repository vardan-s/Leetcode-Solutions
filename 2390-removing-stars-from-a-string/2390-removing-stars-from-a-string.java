class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(ch=='*')
            {
                int j=i-1;
                sb.deleteCharAt(j);
                sb.deleteCharAt(j);
                i=i-2;
            }
        }
        return sb.toString();
    }
}