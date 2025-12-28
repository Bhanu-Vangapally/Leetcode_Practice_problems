// Last updated: 12/28/2025, 4:53:51 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        while(n>0){
            if((n&1)==1) c++;
            n>>=1;
        }
        return c==1;
    }
}