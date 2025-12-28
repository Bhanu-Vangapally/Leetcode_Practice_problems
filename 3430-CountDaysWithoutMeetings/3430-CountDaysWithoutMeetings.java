// Last updated: 12/28/2025, 4:51:55 PM
class Solution {
    public int countDays(int days, int[][] meetings) {
        TreeSet<int[]> in = new TreeSet<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for (int[] meeting : meetings) {
            in.add(meeting);
        }

        List<int[]> mn = new ArrayList<>();
        int[] cn = in.first();
        
        for (int[] i : in) {
            if (i[0] <= cn[1] + 1) {
                cn[1] = Math.max(cn[1], i[1]);
            } else {
                mn.add(cn);
                cn = i;
            }
        }
        mn.add(cn);

        int f = 0;
        int l = 0;

        for (int[] i : mn) {
            if (i[0] > l + 1) {
                f += i[0] - l - 1;
            }
            l = i[1];
        }

        if (days > l) {
            f += days - l;
        }

        return f;
   }
}