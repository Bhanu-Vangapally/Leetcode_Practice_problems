// Last updated: 12/28/2025, 4:51:32 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int al=0,bb=0;
        for(int i:nums){
            if(i>=10) al+=i;
            else bb+=i;
        }
        if(al<bb){ int t=bb;
        bb=al;
        al=t;
        }if(al>bb) return true;
        return false;
    }
}