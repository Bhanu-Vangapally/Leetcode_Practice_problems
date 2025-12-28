# Last updated: 12/28/2025, 4:52:13 PM
class Solution:
    def scoreOfString(self, s: str) -> int:
        score = 0
        for i in range(1, len(s)):
            score += abs(ord(s[i]) - ord(s[i-1]))
        return score

# Test the solution
solution = Solution()
print(solution.scoreOfString("hello"))  # Output: 13
print(solution.scoreOfString("zaz"))    # Output: 50
