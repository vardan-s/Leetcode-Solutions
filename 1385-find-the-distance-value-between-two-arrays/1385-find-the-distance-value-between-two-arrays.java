class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            int c=0;
            for(int j=0;j<arr2.length;j++)
            {
                int sum=arr1[i]-arr2[j];
                if(Math.abs(sum)<=d)
                {
                    c=-1;
                    break;
                }
            }
            if(c==0)
            {
                count++;
            }
        }
        return count;
    }
}