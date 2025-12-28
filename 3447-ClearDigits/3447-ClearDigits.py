# Last updated: 12/28/2025, 4:51:58 PM
class Solution:
    def clearDigits(self, s: str) -> str:
        ls = []
        for i in s:
            ls.append(i)
        while any(char.isdigit() for char in ls):
            for i, k in enumerate(ls):
                if k.isdigit():
                    for j in range(i - 1, -1, -1):
                        if ls[j].isalpha():
                            ls.pop(j)
                            break
                    ls.pop(i - 1)
                    break
    
        return ''.join(ls)