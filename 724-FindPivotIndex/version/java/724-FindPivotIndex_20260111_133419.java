// Last updated: 1/11/2026, 1:34:19 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int ts=0;
4        for(int i:nums) ts+=i;
5        int ls=0;
6        for(int i=0;i<nums.length;i++){
7            int cs=nums[i];
8            int rs=ts-ls-cs;
9            if(ls==rs) return i;
10            ls+=cs;
11        }
12        return -1;
13    }
14}