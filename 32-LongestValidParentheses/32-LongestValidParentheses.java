// Last updated: 1/1/2026, 10:57:00 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3        int lc=0;
4        int rc=0;
5        int mxl=0;
6        for(int i=0;i<s.length()-1;i++){
7            if(s.charAt(i)=='(') lc++;
8            else rc++;
9            if(lc==rc) mxl=Math.max(mxl,2*lc);
10            if(rc>lc) lc=rc=0;
11        }
12        lc=rc=0;
13        for(int i=s.length()-1;i>=0;i--){
14            if(s.charAt(i)=='(') lc++;
15            else rc++;
16            if(lc==rc) mxl=Math.max(mxl,2*lc);
17            if(lc>rc) lc=rc=0;
18        }
19        return mxl;
20    }
21}