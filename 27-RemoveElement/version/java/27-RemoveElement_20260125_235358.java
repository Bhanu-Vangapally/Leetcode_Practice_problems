// Last updated: 1/25/2026, 11:53:58 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=val){
6                nums[c++]=nums[i];
7               
8            }
9        }
10        return c;
11    }
12}