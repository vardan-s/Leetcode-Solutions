class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> star=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            st.push(i);
            else if(ch=='*')
            star.push(i);
            else{
                if(st.size()==0 && star.size()==0)
                return false;
                if(st.size()>0)
                st.pop();
                else if(star.size()>0)
                star.pop();

            }
        }
        while(!st.empty() && !star.empty())
        {
            if(st.peek()>star.peek())
            return false;
            st.pop();
            star.pop();
        }
        return st.empty();
    }

}