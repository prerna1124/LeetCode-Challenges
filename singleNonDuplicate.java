/*
*Single Element in a Sorted Array
* It uses binary Search
* Runs in O(log n) time and O(1) space.
*
*Input: [1,1,2,3,3,4,4,8,8]
* Output: 2
*/
class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        return search(nums,0,nums.length-1);
    }
    static int search(int[] a,int start,int end)
    {
        if(start>end)
            return -1;
        if(start == end)
            return a[start];
        int mid = (start+end)/2;
        if(mid%2==0)
        {
            if(a[mid]==a[mid+1])
                return search(a,mid+1,end);
            else
                return search(a,start,mid);
        }
        else if(mid%2==1)
        {
            if(a[mid]==a[mid+1])
                return search(a,start,mid-1);
            else
               return search(a,mid+1,end);
        }
        else
            return -1;
    }
}
