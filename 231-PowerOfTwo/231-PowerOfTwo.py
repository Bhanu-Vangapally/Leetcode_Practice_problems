# Last updated: 12/28/2025, 4:53:53 PM
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        return n and  not (n &n-1)