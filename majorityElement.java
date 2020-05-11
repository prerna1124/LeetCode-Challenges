/*
  The majority element is the element that appears more than ⌊ n/2 ⌋ times.
  Example 1 - Input: [3,2,3]
              Output: 3
  Example 2 - Input: [2,2,1,1,1,2,2]
              Output: 2
*/

class Solution 
{
    public int majorityElement(int[] nums)
    {
   
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!(hm.containsKey(nums[i])))
            {
                k=0;
                hm.put(nums[i],++k);
            }
            else
            {
                int p=hm.get(nums[i]);
                hm.replace(nums[i],++p);
            }
          
        }
        
        int val = (int)Math.floor(nums.length/2);
       
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry mapElement = (Map.Entry)it.next();
            if((int)mapElement.getValue()>val)
                return (int)mapElement.getKey();
        }
        return -1;
    }
}
