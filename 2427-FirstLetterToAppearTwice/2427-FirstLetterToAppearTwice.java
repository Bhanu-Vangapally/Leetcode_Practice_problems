// Last updated: 12/28/2025, 4:52:24 PM
class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a']==1) return s.charAt(i);
            freq[s.charAt(i) - 'a']++;
        }
        
        // Step 2: Iterate through the string again to find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 2) {
                return s.charAt(i);
            }
        }
        return 'p'; 
    }
}