# Last updated: 12/28/2025, 4:53:38 PM
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        s=0
        for i in range(1,n+1):
            s+=i
        return s-sum(nums)