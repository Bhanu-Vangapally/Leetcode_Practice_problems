// Last updated: 2/12/2026, 12:07:11 AM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if (s.length() != t.length()) return false;
4        
5        Map<Character, Character> mp = new HashMap<>();
6        for (int i = 0; i < s.length(); i++) {
7            char charS = s.charAt(i);
8            char charT = t.charAt(i);
9
10            if (mp.containsKey(charS)) {
11                // Bug 1 fix: Compare against the mapped character, not the index
12                if (mp.get(charS) != charT) return false;
13            } else {
14                // Bug 2 fix: Ensure charT isn't already mapped to a different charS
15                if (mp.containsValue(charT)) return false;
16                mp.put(charS, charT);
17            }
18        }
19        return true;
20    }
21}
22