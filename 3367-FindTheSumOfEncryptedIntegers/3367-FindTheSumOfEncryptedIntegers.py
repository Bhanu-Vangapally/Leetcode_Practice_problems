# Last updated: 12/28/2025, 4:52:15 PM
def enc(x):
        m=max(int(I) for I in str(x))
        return int(str(m)*len(str(x)))
class Solution:
    def sumOfEncryptedInt(self, nums: List[int]) -> int:
        total = 0
        for num in nums:
            total += enc(num)
        return total
    