// Last updated: 2/4/2026, 12:24:11 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long i=0,j=(long)Math.sqrt(c);
4        while(i<=j){
5            long s=i*i+j*j;
6            if(s==c) return true;
7            else if(s>c) j--;
8            else i++;
9        }
10        return false;
11    }
12}