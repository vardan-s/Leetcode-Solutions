class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(ch>='0' && ch<='9')
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