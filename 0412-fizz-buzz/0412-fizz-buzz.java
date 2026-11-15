class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> st=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if((i+1)%3==0 && (i+1)%5==0)
            {
                String str="FizzBuzz";
                st.add(str);
            }
            else if((i+1)%3==0)
            {
                String str="Fizz";
                st.add(str);
            }
            else if((i+1)%5==0)
            {
                String str="Buzz";
                st.add(str);
            }
            else
            {
                st.add(String.valueOf(i+1));
            }
        }
        return st;
    }
}