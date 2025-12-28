# Last updated: 12/28/2025, 4:51:48 PM
class Solution:
    def numberOfChild(self, n: int, k: int) -> int:
        x=2*(n-1)
        r=k%x
        if r<=n-1:
            return r
        return 2*(n-1)-r