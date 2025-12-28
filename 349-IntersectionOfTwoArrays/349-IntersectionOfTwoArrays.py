# Last updated: 12/28/2025, 4:53:08 PM
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        x=[]
        for i in nums1:
            if i in nums2:
                x.append(i)
        ans=set(x)
        return list(ans)