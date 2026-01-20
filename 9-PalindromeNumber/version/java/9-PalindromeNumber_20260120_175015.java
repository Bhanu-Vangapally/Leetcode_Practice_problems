// Last updated: 1/20/2026, 5:50:15 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0) return false;
4        int r=0,t=x;
5        while(t>0){
6            r=(r*10)+t%10;
7            t/=10;
8        }
9        return r==x;
10    }
11}