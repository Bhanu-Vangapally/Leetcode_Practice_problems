// Last updated: 12/28/2025, 4:52:40 PM
import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
      PriorityQueue<BigInteger> minHeap = new PriorityQueue<>();
      for(String num:nums){
          BigInteger negateNum = new BigInteger(num).negate();
          minHeap.offer(negateNum);
      }  
      while(k>1){
          minHeap.poll();
          k--;
      }
      return String.valueOf(minHeap.peek().negate());
    }
}