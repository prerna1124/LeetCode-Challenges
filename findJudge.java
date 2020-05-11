/*
The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.

Input: N = 2, trust = [[1,2]]
Output: 2

Input: N = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1

Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
Output: 3
*/

import java.util.Collections;
class Solution {
    public int findJudge(int N, int[][] trust)
    {
        if(N==1)
            return 1;
        if(N<=0)
            return -1;
        if(trust.length == 0)
            return -1;
        if(trust.length==1)
            return trust[0][1];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int k,j;
        for(int i=0;i<trust.length;i++)
        {
            int p = trust[i][1];
            if(!(hm.containsKey(p)))
            {
                hm.put(p,0);
            }
        }   
        for(int i=0;i<trust.length;i++)
        {
            k = trust[i][0];
            if(!(hm.containsKey(k)))
            {
                k = hm.get(trust[i][1]);
                k += 1;
                hm.replace(trust[i][1],k);
            }
            else
            {
                if(hm.containsKey(trust[i][1]))
                {
                    k = hm.get(trust[i][1]);
                    k += 1;
                    hm.replace(trust[i][1],k);
                }
                hm.replace(trust[i][0],-1);
            }
        }
        
        for(HashMap.Entry<Integer,Integer> mp : hm.entrySet())
        {
                if((int)mp.getValue()!= -1 && (int)mp.getValue()==N-1)
                return (int)mp.getKey();
        }
        return -1;
    }
}
