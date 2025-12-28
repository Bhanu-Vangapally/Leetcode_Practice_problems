# Last updated: 12/28/2025, 4:52:06 PM
class Solution:
    def minimumChairs(self, s: str) -> int:
        c=0
        ans=0
        for i in s:
            if i=='E':
                c+=1
                ans=max(ans,c)
            else:
                c-=1
        return ans