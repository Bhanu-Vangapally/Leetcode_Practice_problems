# Last updated: 12/28/2025, 4:51:43 PM
class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        nums.sort()
        x=[]
        while(len(nums)>0):
            a=nums[0]
            b=nums[-1]
            nums.remove(a)
            nums.remove(b)
            c=a+b
            x.append(c/2)
        x.sort()
        # print(nums[-2])
        return round(x[0],1)