// Last updated: 12/28/2025, 4:53:17 PM
class Solution {
    public int[] countBits(int n) {
        int [] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++)
        {
        ans[i]=ans[i>>1] +(i&1);
        }
        return ans;
        }
}