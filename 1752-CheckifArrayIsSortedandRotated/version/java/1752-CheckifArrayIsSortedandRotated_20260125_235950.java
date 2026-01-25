// Last updated: 1/25/2026, 11:59:50 PM
1class Solution {
2    public boolean check(int[] nums) {
3        int n=nums.length;
4        int c=0;
5        for(int i=0;i<n;i++){
6            if(nums[i]>nums[(i+1)%n]) c++;
7            if(c>1) return false;
8        }
9        return true;
10    }
11}