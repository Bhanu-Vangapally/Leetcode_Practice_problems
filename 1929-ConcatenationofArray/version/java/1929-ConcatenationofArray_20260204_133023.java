// Last updated: 2/4/2026, 1:30:23 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int [] ans=new int[2*n];
4        int i=0,j=n,k=0;
5        while(n-->0){
6            ans[k++]=nums[i++];
7            ans[k++]=nums[j++];
8        }
9        return ans;
10    }
11}