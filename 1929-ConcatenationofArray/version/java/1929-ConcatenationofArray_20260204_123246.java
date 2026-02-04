// Last updated: 2/4/2026, 12:32:46 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n=nums.length;
4        int ans[]=new int[n*2];
5        for(int i=0;i<n*2;i++){
6            ans[i]=nums[i%n];
7        }
8        return ans;
9    }
10}