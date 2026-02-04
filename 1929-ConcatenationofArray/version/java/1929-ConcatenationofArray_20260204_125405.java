// Last updated: 2/4/2026, 12:54:05 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        if(nums.length==1) return nums[0];
4        int cur,prev=nums[0],sol=0,res=0;
5        if(prev==1) res++;
6        for(int i=1;i<nums.length;i++){
7            cur=nums[i];
8            if(prev==1 && cur==1) res++;
9            if(prev==0 && cur==1) res=1;
10            prev=cur;
11            sol=Math.max(res,sol);
12        }
13        return sol;
14    }
15}