class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            st1.push(s.charAt(i));
            else{
            st2.push(s.charAt(i));
            }
        }
        if(st1.size()>st2.size())
        return st1.size()-st2.size();
        else
        return st2.size()-st1.size();
    }
}