// Last updated: 1/3/2026, 3:41:07 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int dp[]=new int[amount+1];
4        Arrays.fill(dp,amount+1);
5        dp[0]=0;
6        for(int amt=1;amt<=amount;amt++){
7            for(int c:coins){
8                if(c<=amt) dp[amt]=Math.min(dp[amt],dp[amt-c]+1);
9            }
10        }
11        return dp[amount]!=amount+1?dp[amount]:-1;
12    }
13}