# Last updated: 12/28/2025, 4:52:05 PM
class Solution:
    def addedInteger(self, nums1: List[int], nums2: List[int]) -> int:
        n=sum(nums1)
        n1=sum(nums2)
        c=n1-n
        return c//len(nums1)