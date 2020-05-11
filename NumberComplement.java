/*
Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
*/

class Solution
{
    public int findComplement(int num) 
    {
      
        if(num==0)
            return 1;
        else if(num==1)
            return 0;
        else
        {
            int count = 0;
            int m=num;
            while(m!=0)
            {
                m/=2;
                count++;
            }
            return (((1<<count)-1)^num);
        }
        
    }
}
