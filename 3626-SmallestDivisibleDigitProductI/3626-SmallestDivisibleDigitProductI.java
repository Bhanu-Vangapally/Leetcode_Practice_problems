// Last updated: 12/28/2025, 4:51:20 PM
class Solution {
    public static int digitProduct(int num) {
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                product = 0;
                break;
            }
            product *= digit;
            num /= 10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        while (true) {
            if (digitProduct(n) % t == 0) {
                return n;
            }
            n++;
        }  
    }
}