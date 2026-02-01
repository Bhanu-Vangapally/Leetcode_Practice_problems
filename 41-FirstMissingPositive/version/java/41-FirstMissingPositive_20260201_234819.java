// Last updated: 2/1/2026, 11:48:19 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n=nums.length;
4        for(int i=0;i<n;i++) if(nums[i]<=0) nums[i]=n+1;
5        for(int i=0;i<n;i++){
6            if(Math.abs(nums[i])<=n){
7                int bucket_idx=Math.abs(nums[i])-1;
8                if(nums[bucket_idx]>0) nums[bucket_idx]*=-1;
9            }
10        }
11        for(int i=0;i<n;i++) if(nums[i]>0) return i+1;
12        return n+1;
13    }
14}