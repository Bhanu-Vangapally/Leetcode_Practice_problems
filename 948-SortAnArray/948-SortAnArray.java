// Last updated: 12/28/2025, 4:52:46 PM
class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> mn =new PriorityQueue<>();
        for(int i:nums) mn.add(i);
        int [] ar=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ar[i]=mn.poll();
        }
        return ar;
    }
}