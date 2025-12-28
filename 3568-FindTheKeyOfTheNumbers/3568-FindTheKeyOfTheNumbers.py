# Last updated: 12/28/2025, 4:51:27 PM
class Solution:
    def generateKey(self, num1: int, num2: int, num3: int) -> int:
        num1_str = f"{num1:04}"
        num2_str = f"{num2:04}"
        num3_str = f"{num3:04}"
    
        key = ""
        for i in range(4):
            min_digit = min(num1_str[i], num2_str[i], num3_str[i])
            key += min_digit
        return int(key)