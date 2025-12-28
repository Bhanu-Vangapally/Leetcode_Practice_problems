// Last updated: 12/28/2025, 4:51:29 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            boolean cc = true;
            int maxElement = nums[i];

            for (int j = i + 1; j < i + k; j++) {
                if (nums[j] != nums[j - 1] + 1) {
                    cc = false;
                    break;
                }
                maxElement = Math.max(maxElement, nums[j]);
            }

            if (cc) {
                res[i] = maxElement;
            } else {
                res[i] = -1;
            }
        }

        return res;
    }
}