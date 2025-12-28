# Last updated: 12/28/2025, 4:52:38 PM
class Solution:
    def kthLargestNumber(self, nums: List[str], k: int) -> str:
        l=[]
        for i in nums:
            i=int(i)
            l.append(i)
        for i in range(k-1):
            l.remove(max(l))
        return str(max(l))
