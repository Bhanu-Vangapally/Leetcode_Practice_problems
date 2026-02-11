// Last updated: 2/11/2026, 11:40:19 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int n=nums.length/2+1;
4        Map<Integer,Integer> mp=new HashMap<>();
5        for(int i:nums) mp.put(i,mp.getOrDefault(i,0)+1);
6        for(int i:mp.keySet()) if(mp.get(i)>=n) return i;
7        return -1;
8    }
9}