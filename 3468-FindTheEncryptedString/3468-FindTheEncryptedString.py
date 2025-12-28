# Last updated: 12/28/2025, 4:51:47 PM
class Solution:
    def getEncryptedString(self, s: str, k: int) -> str:
        n=len(s)
        ans=""
        for i in range(len(s)):
            x=(i+k)%n
            ans+=s[x]
        return ans