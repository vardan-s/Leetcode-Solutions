class Solution {
    public int reverse(int x) {
        if(x==0)
        return 0;
        int count=1;
        long c=0;
        while(x>0 || x<0)
        {
            
            int n=x%10;
            if(count==1)
            {
                count=0;
                if(n==0)
                continue;
                

            }
            count=0;
            c=c*10+n;
            x=x/10;
        }
        if (c > Integer.MAX_VALUE || c < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int)c;
    }
}