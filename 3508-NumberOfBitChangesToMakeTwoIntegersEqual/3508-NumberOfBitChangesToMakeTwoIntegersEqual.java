// Last updated: 12/28/2025, 4:51:39 PM
class Solution {
    public int minChanges(int n, int k) {
        if (n < k)
            return -1;
    
    // # If k has any bit set to 1 that is not set in n, return -1
    if ((n & k) != k)
        return -1;
    
    // # Count the number of bits to change
    int count = 0;
    while (n > 0){
        if ((n & 1) == 1 && (k & 1) == 0)
            count += 1;
        n >>= 1;
        k >>= 1;
    }
    
    return count;
    }
}