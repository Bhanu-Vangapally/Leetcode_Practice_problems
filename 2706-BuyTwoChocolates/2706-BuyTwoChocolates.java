// Last updated: 1/3/2026, 7:30:43 PM
1class Solution {
2    public int buyChoco(int[] prices, int money) {
3        Arrays.sort(prices);
4        int s=prices[0]+prices[1];
5        return s>money?money:Math.abs(s-money);
6    }
7}