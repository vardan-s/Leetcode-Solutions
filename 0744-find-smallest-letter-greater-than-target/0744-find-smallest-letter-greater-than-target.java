class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int high=letters.length-1,low=0;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if((int)letters[mid]>(int)target)
            {
                high=mid-1;
               
            }
            else 
            {
                low=mid+1;
            }
            
        }
        return letters[low%letters.length];
    }
}