# Last updated: 12/28/2025, 4:52:12 PM
class Solution:
    def numberOfRightTriangles(self, grid: List[List[int]]) -> int:
        n = len(grid)
        m = len(grid[0])
        count = 0

        row = [sum(row) for row in grid]
        col = [sum(grid[i][j] for i in range(n)) for j in range(m)]

        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1:
                    count += (row[i] - 1) * (col[j] - 1)

        return count