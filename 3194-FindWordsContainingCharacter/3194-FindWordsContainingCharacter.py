# Last updated: 12/28/2025, 4:52:25 PM
from typing import List
class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
         return [i for i, word in enumerate(words) if x in word]
