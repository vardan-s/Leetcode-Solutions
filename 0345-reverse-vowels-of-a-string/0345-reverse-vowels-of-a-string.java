class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int low=0,high=s.length()-1;
        while(low<high)
        {            
            char ch=s.charAt(low);
            char ch1=s.charAt(high);
            if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
            {
                low++;
            }
            else if(!(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U'))
            {
                high--;
            }
            else{
                sb.setCharAt(low,ch1);
                sb.setCharAt(high,ch);
                low++;
                high--;
            }
        }
        return sb.toString();

    }
}