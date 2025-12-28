# Last updated: 12/28/2025, 4:52:11 PM
class Solution:
    def isValid(self, word: str) -> bool:
 
        if len(word) < 3:
            return False
        v=False
        c=False
        d=True
        l=True
        u=True
    
    # Check if the word contains at least one vowel and one consonant
        vowels = set('aeiouAEIOU')
        consonants = set('bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ')
        for i in word:
            if i in vowels:
                v=True
            elif i in consonants:
                c=True
            elif i.isdigit():
                d=True
            elif i.isalpha():
                if i.isupper():
                    u=True
                else:
                    l=True
            else:
                return False
                
    
    
        return v and c and d and l and u
            