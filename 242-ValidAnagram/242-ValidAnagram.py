# Last updated: 12/28/2025, 4:53:40 PM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        l=list()
        c=0
        for i in s:
            l.append(i)
        for i in t:
            if i in l:
                l.remove(i)
        if(len(l)==0):
            return True
        return False