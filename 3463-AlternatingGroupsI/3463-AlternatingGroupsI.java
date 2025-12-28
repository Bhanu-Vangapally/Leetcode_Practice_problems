// Last updated: 12/28/2025, 4:51:46 PM
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int c=0,m=0;
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            int nextNext = (i + 2) % n;
            if (colors[i] != colors[next] && colors[next] != colors[nextNext] && colors[i] == colors[nextNext]) {
                c++;
            }
        }
        return c;
    }
}