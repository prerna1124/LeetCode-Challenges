/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
*/


class Solution
{
    public int firstUniqChar(String s)
    {
       if(s.length()==0)
           return -1;
        else
        {
            Integer[] arr = new Integer[26];
            for(int i=0;i<26;i++)
                arr[i] = 0;
            for(int i=0;i<s.length();i++)
                arr[s.charAt(i)-97]++;
            for(int i=0;i<s.length();i++)
            {
                if(arr[s.charAt(i)-97]==1)
                    return i;
            }
            return -1;
        }
    }
}
