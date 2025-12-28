// Last updated: 12/28/2025, 4:51:53 PM
class Solution {
    public List<String> validStrings(int n) {
       List<String> result = new ArrayList<>();
        backtrack(result, "", n);
        return result;
    } 
    private void backtrack(List<String> result, String currentString, int n) {
        if (currentString.length() == n) {
            result.add(currentString);
            return;
        }
    
        backtrack(result, currentString + '1', n);
        
        if (currentString.isEmpty() || currentString.charAt(currentString.length() - 1) != '0') {
            backtrack(result, currentString + '0', n);
        }
    }
}