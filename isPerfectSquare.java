/*
Input: 16
Output: true

Input: 14
Output: false

Method1 - sum of Odd numbers Always lead to a perfect square.  O(n)
Method2 - Binary Search O(logn)
*/

class Solution
{
    public boolean isPerfectSquare(int num) 
    {
        if(num<0) 
            return false;
        if(num==1&&num==0)
            return true;
       long start = 1,end = num;
        while(start<=end)
        {
            long mid = start+(end-start)/2;
            long sq = mid *mid;
            if(sq<num)
                start = mid+1;
            else if(sq>num)
                end = mid-1;
            else 
                return true;
        }
        return false;   
    }
}
