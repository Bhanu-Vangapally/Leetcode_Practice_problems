# Last updated: 12/28/2025, 4:52:01 PM
class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        s=set()
        c=0
        for i in word:
            if i.islower():
                x=i.upper()
                if x in word:
                    s.add(i)
                    c+=1
        return len(s)