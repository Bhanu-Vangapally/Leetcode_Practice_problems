# Last updated: 12/28/2025, 4:52:20 PM
class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        n = len(nums)
        res = 0

        for i in range(n):
            count = {}
            for j in range(i, n):
                count[nums[j]] = count.get(nums[j], 0) + 1
                distinct_count = len(count)
                res += distinct_count * distinct_count

        return res

# Custom Input
nums = [1,2,1]
sol = Solution()
print(sol.sumCounts(nums))