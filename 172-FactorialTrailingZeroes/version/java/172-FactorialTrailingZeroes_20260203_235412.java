// Last updated: 2/3/2026, 11:54:12 PM
1class Solution {
2    public int trailingZeroes(int n) {
3        int res=0;
4        for(int i=5;i<=n;i*=5){
5            res+=n/i;
6        }
7        return res;
8    }
9}