# Last updated: 12/28/2025, 4:52:34 PM
class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        ans=0
        for i in range(0,2):
            for i in edges[0]:
                if i in edges[1]:
                    ans=i
        return ans