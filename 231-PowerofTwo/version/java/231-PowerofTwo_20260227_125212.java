// Last updated: 2/27/2026, 12:52:12 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0) return false;
4        return (n&(n-1))==0;
5    }
6}