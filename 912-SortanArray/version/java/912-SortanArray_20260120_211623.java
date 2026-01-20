// Last updated: 1/20/2026, 9:16:23 PM
1class Solution {
2    public int[] sortArray(int[] nums) {
3        int n=nums.length;
4        dvd(nums,0,n-1);
5        return nums;
6    }
7    void dvd(int[] nums,int l,int r){
8        if(l<r){
9            int m=l+(r-l)/2;
10            dvd(nums,l,m);
11            dvd(nums,m+1,r);
12            merge(nums,l,r,m);
13        }
14    }
15    void merge(int[] arr,int l,int r,int m){
16        int n1 = m - l + 1;
17        int n2 = r - m;
18        int[] leftArr = new int[n1];
19        int[] rightArr = new int[n2];
20
21        // Copy data to temporary arrays
22        for (int i = 0; i < n1; ++i)
23            leftArr[i] = arr[l + i];
24        for (int j = 0; j < n2; ++j)
25            rightArr[j] = arr[m + 1 + j];
26
27        // Merge the temporary arrays
28        int i = 0, j = 0;
29        int k = l; // Initial index of merged subarray
30        while (i < n1 && j < n2) {
31            if (leftArr[i] <= rightArr[j]) {
32                arr[k] = leftArr[i];
33                i++;
34            } else {
35                arr[k] = rightArr[j];
36                j++;
37            }
38            k++;
39        }
40
41        // Copy remaining elements of leftArr[] if any
42        while (i < n1) {
43            arr[k] = leftArr[i];
44            i++;
45            k++;
46        }
47
48        // Copy remaining elements of rightArr[] if any
49        while (j < n2) {
50            arr[k] = rightArr[j];
51            j++;
52            k++;
53        }
54    }
55}