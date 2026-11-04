class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(i);
            }
            else if(ch==')')
            {
                if(st.size()!=0 && s.charAt(st.peek())!=')')
                {
                    st.pop();
                }
                else
                {
                    st.push(i);
                }
            }
        }
        while(st.size()!=0)
        {
            sb.deleteCharAt(st.pop());
        }
        return sb.toString();
    }
}