class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split("\\s+");
        String temp="";
        for(int i=str.length-1;i>=0;i--)
        {
            temp+=str[i]+" ";
        }
        return temp.trim();
    }
}