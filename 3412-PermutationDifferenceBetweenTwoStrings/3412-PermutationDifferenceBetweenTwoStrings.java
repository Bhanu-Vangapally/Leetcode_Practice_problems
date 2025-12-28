// Last updated: 12/28/2025, 4:52:04 PM
public class Solution {
    public int findPermutationDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] l = t.toCharArray();
        int m = 0;
        
        for (char i : s1) {
            for (char j : l) {
                if (i == j) {
                    m += Math.abs(new String(s1).indexOf(i) - new String(l).indexOf(j));
                }
            }
        }

        return m;
    }
}
