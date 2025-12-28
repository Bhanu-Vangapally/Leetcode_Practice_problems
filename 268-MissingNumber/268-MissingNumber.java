// Last updated: 12/28/2025, 4:53:35 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=n*(n+1)/2;
        for(int i:nums) s-=i;
        return s;
    }
}