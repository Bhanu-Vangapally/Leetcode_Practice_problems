// Last updated: 1/21/2026, 5:51:59 PM
1class Solution {
2    public int[] countBits(int n) {
3        int[] dp = new int[n + 1];
4        int ans = 0;
5
6        for (int i = 1; i <= n; i++) {
7            dp[i] = dp[i >> 1] + (i & 1);
8            ans += dp[i];
9        }
10
11        return dp;
12    }
13}