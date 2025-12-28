// Last updated: 12/28/2025, 4:53:43 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] ans=new int[amount+1];
        Arrays.fill(ans,amount+1);
        ans[0]=0;
        for(int i=1;i<amount+1;i++){
            for(int coin:coins){
                if(i-coin>=0)
                {
                    ans[i]=Math.min(1+ans[i-coin], ans[i]);
                }
            }
        }
        // for(int i: ans)

        return ans[amount] > amount ? -1: ans[amount];

    }
}