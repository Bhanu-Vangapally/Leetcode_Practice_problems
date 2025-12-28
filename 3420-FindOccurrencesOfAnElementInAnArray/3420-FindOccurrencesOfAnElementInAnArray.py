# Last updated: 12/28/2025, 4:51:59 PM
class Solution:
    def occurrencesOfElement(self, nums: List[int], queries: List[int], x: int) -> List[int]:
        positions = defaultdict(list)
        
        for index, num in enumerate(nums):
            positions[num].append(index)
        
        result = []
        
        x_positions = positions.get(x, [])
        
        for query in queries:
            if 1 <= query <= len(x_positions):
                result.append(x_positions[query - 1])
            else:
                result.append(-1)
        
        return result