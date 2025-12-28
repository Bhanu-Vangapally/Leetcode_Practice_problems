# Last updated: 12/28/2025, 4:52:21 PM
from typing import List

class Solution:
    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # Initialize sets to store unique elements from each array
        set1 = set(nums1)
        set2 = set(nums2)
        
        # Initialize counters for common elements
        common_count_nums1 = 0
        common_count_nums2 = 0
        
        # Count common elements in nums1
        for num in nums1:
            if num in set2:
                common_count_nums1 += 1
        
        # Count common elements in nums2
        for num in nums2:
            if num in set1:
                common_count_nums2 += 1
        
        return [common_count_nums1, common_count_nums2]

# Example usage:
solution = Solution()
output = solution.findIntersectionValues([4,3,2,3,1], [2,2,5,2,3,6])
print(output)  # Output: [3, 4]
