// Last updated: 1/5/2026, 11:21:53 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int c=0;
4        s=s.strip();
5        for(int i=s.length()-1;i>=0;i--){
6                if(s.charAt(i)!=' ') c++;
7                else break;
8        }
9        return c;
10    }
11}