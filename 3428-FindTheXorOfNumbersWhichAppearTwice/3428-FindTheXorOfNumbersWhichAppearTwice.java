// Last updated: 12/28/2025, 4:51:56 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        Stack<Integer> s=new Stack<>();
        for(int i:nums)
        {
            if(h.contains(i))
            {
                s.push(i); 
            }
            else
            {
                h.add(i);
            }
        }
        int x=0;
        while(!s.isEmpty())
        {
            
        x^=s.pop();

        }
        return x;
    }
}