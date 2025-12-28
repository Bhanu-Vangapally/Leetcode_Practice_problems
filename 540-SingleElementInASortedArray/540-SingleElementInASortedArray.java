// Last updated: 12/28/2025, 4:53:13 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans=0;
        for(int i:nums) ans^=i;
        return ans;
    }
}