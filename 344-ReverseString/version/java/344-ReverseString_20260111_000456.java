// Last updated: 1/11/2026, 12:04:56 AM
1class Solution {
2    public void reverseString(char[] s) {
3        int i=0,j=s.length-1;
4        while(i<j){
5            char t=s[i];
6            s[i]=s[j];
7            s[j]=t;
8            i++;j--;
9        }
10    }
11}