# Last updated: 12/28/2025, 4:52:08 PM
class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        s1=[];l=[]
        m=0
        for i in s:
            s1.append(i)
        for i in t:
            l.append(i)
        for i in s1:
            for j in l:
                if(i==j):
                    m+=abs(s1.index(i)-l.index(j))
                
        # print(s1,l)
        return m