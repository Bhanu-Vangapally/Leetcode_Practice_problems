// Last updated: 12/28/2025, 4:52:03 PM
class Solution {
    public int minimumChairs(String s) {
        int c=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='E')
            {
                c++;
                ans=Math.max(ans,c);
            }
            else
            {
                c--;
            }
        }
        return ans;
    }
}