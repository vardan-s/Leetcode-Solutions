class Solution {
    public int lengthOfLastWord(String s) {
        String a=s.trim();

        int l=a.length()-1;
        int length=0;
        for(int i=l;i>=0;i--)
        {
            char letter=a.charAt(i);
            if(letter!=' ')
            length++; 
            else 
            return length;
        }
        return length;

    }
}