# Last updated: 12/28/2025, 4:52:31 PM
class Solution:
    def largestOddNumber(self, num: str) -> str:
        # Iterate from the last character to the first
        for i in range(len(num) - 1, -1, -1):
            # Check if the current digit is odd
            if int(num[i]) % 2 != 0:
                # Return the substring up to this point
                return num[:i + 1]
        # No odd digit found, return an empty string
        return ""
