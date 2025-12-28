// Last updated: 12/28/2025, 4:51:23 PM
class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String num1Str = String.format("%04d", num1);
        String num2Str = String.format("%04d", num2);
        String num3Str = String.format("%04d", num3);
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char minDigit = (char) Math.min(Math.min(num1Str.charAt(i), num2Str.charAt(i)), num3Str.charAt(i));
            key.append(minDigit);
        }
        return Integer.parseInt(key.toString());
    }
}