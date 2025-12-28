// Last updated: 12/28/2025, 4:52:33 PM
class Solution {
    public int findCenter(int[][] edges) {
        int p = edges[0][0], q = edges[0][1];
        int r = edges[1][0], s = edges[1][1];
        return p == r || p == s ? p : q;
    }
}
