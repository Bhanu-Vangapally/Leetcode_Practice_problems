# Last updated: 12/28/2025, 4:51:25 PM
class Solution:
    def isBalanced(self, num: str) -> bool:
        c=0;ev=0;od=0
        for i in num:
            if c%2==0:
                ev+=int(i);
            else:
                od+=int(i);
            c+=1
        return ev==od