class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        return x;
        int low=1,high=x/2;
        int mid=-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            long square= (long)mid*mid;
            if(square==x)
            return mid;
            else if(square>x)
            high=mid-1;
            else 
            low=mid+1;
        }
        return high;

    }
}