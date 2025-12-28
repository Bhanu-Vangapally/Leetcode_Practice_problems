// Last updated: 12/28/2025, 4:53:09 PM
class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Use an array to store character frequencies (for 'a'-'z')
        // Using an array is much faster than a Map for fixed-size character sets.
        int[] freq = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        // Step 2: Iterate through the string again to find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1; // No unique character found
    }
}
