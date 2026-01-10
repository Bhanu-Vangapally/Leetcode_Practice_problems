// Last updated: 1/11/2026, 12:17:48 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        for (char c : s.toCharArray()) {
6            if (Character.isLetterOrDigit(c)) {
7                sb.append(Character.toLowerCase(c));
8            }
9        }
10
11        return sb.toString().equals(sb.reverse().toString());
12    }
13}
14