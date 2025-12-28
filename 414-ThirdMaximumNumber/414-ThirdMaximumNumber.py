# Last updated: 12/28/2025, 4:53:10 PM
class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        l=set(nums)
        nums=list(l)
        # nums.sort()
        if len(nums)<=2:
            return max(nums)
        else:
            for i in range(0,2):
                nums.remove(max(nums))
            return max(nums)