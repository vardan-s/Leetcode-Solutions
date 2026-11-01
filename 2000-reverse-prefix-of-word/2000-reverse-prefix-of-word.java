class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder(word);
        int val=-1;
        int low=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(ch==c){
                val=i;
                break;
            }
        }
        if(val!=-1){
        while(low<val)
        {
            char c=sb.charAt(val);
            sb.setCharAt(val,sb.charAt(low));
            sb.setCharAt(low,c);
            low++;
            val--;
        }
        }
        return sb.toString();
    }
}