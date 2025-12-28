# Last updated: 12/28/2025, 4:51:42 PM
class Solution:
    def minOperations(self, nums: List[int]) -> int:
        n = len(nums)
        if n < 3:
            return -1 if 0 in nums else 0
        operations = 0
        for i in range(n - 2):
            if nums[i] == 0:
                nums[i] = 1 - nums[i]
                nums[i + 1] = 1 - nums[i + 1]
                nums[i + 2] = 1 - nums[i + 2]
                operations += 1
        if nums[-2] == 0 or nums[-1] == 0:
            return -1
        return operations
            