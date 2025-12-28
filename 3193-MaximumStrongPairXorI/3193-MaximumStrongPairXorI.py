# Last updated: 12/28/2025, 4:52:23 PM
class Solution:
    def maximumStrongPairXor(self, nums):
        max_xor = 0
        n = len(nums)

        for i in range(n):
            for j in range(i, n):
                if abs(nums[i] - nums[j]) <= min(nums[i], nums[j]):
                    max_xor = max(max_xor, nums[i] ^ nums[j])

        return max_xor

# Example usage:
sol = Solution()
nums1 = [1, 2, 3, 4, 5]
nums2 = [10, 100]
nums3 = [5, 6, 25, 30]

print(sol.maximumStrongPairXor(nums1))  # Output: 7
print(sol.maximumStrongPairXor(nums2))  # Output: 0
print(sol.maximumStrongPairXor(nums3))  # Output: 7
