// Last updated: 12/28/2025, 4:51:31 PM
class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        List<Map<Integer, Integer>> playerPicks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            playerPicks.add(new HashMap<>());
        }
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            Map<Integer, Integer> colorCount = playerPicks.get(player);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }
        int winningPlayers = 0;
        for (int player = 0; player < n; player++) {
            Map<Integer, Integer> colorCount = playerPicks.get(player);
            for (int count : colorCount.values()) {
                if (count >= player + 1) {
                    winningPlayers++;
                    break;
                }
            }
        }
        return winningPlayers;
    }
}