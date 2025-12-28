// Last updated: 12/28/2025, 4:53:07 PM
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        } 
        int[] uniqueNums = new int[numSet.size()];
        int index=0;
        for(int num:numSet){
            uniqueNums[index++]=num;
        }
        if(numSet.size()<3){
            int max=Integer.MIN_VALUE;
            for(int num: numSet){
                max=Math.max(max,num);
            }
            return max;
        }
        
        PriorityQueue<Integer>minHeap = new PriorityQueue<>();
        for(int num: uniqueNums){
            minHeap.add(num);
            if(minHeap.size()>3){
                minHeap.poll();
            }
        }
        int ans=minHeap.poll();
        return ans;
    }
}