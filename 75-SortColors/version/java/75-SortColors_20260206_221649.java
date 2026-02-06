// Last updated: 2/6/2026, 10:16:49 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int l=0,r=nums.length-1,m=0;
4        while(m<=r){
5            if(nums[m]==0){
6                int t=nums[l];
7                nums[l]=nums[m];
8                nums[m]=t;
9                // swap(nums[l],nums[m]);
10                l++;
11                m++;
12            }else if(nums[m]==2){
13                // swap(nums[m],nums[r]);
14                int t=nums[m];
15                nums[m]=nums[r];
16                nums[r]=t;
17                r--;
18            }else m++;
19        }
20    }
21    public void swap(int i,int j){
22        int t=i;
23        i=j;
24        j=t;
25    }
26}