// Last updated: 1/11/2026, 12:16:24 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s=s.trim().strip().toLowerCase();
4        int i=0,j=s.length()-1;
5        while(i<j){
6            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
7            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;
8            if(s.charAt(i)!=s.charAt(j)) return false;
9            i++;j--;
10        }
11        return true;
12    }
13}