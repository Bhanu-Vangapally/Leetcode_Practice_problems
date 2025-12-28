# Last updated: 12/28/2025, 4:52:09 PM
class Solution:
    def canMakeSquare(self, grid: List[List[str]]) -> bool:
        def check_subgrid(subgrid):
            return all(cell == subgrid[0][0] for row in subgrid for cell in row)
        
        for i in range(2):
            for j in range(2):
                subgrid = [grid[i][j:j+2], grid[i+1][j:j+2]]
                if check_subgrid(subgrid):
                    return True
        
        for i in range(3):
            for j in range(3):
                original_color = grid[i][j]
                grid[i][j] = 'B' if original_color == 'W' else 'W'
                for x in range(2):
                    for y in range(2):
                        subgrid = [grid[x][y:y+2], grid[x+1][y:y+2]]
                        if check_subgrid(subgrid):
                            return True
                grid[i][j] = original_color
        
        return False        