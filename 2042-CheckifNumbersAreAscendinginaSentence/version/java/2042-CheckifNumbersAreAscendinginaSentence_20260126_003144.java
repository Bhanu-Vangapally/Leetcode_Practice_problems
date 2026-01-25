// Last updated: 1/26/2026, 12:31:44 AM
1// class Solution {
2//     public boolean areNumbersAscending(String s) {
3//         int id=Integer.MIN_VALUE;
4//         for(char i:s.toCharArray()){
5//             if(i>='0' && i<='9'){
6//                 int cur =i-'0';
7//                 if(id>=cur) return false;
8//                 id=cur;
9//                 }
10//         }
11//         return true;
12//     }
13// }
14class Solution {
15    public boolean areNumbersAscending(String s) {
16        int prev = -1;
17        int cur = 0;
18        boolean building = false;
19
20        for (char ch : s.toCharArray()) {
21            if (ch >= '0' && ch <= '9') {
22                cur = cur * 10 + (ch - '0');
23                building = true;
24            } else {
25                if (building) {
26                    if (cur <= prev) return false;
27                    prev = cur;
28                    cur = 0;
29                    building = false;
30                }
31            }
32        }
33
34        // Check last number if string ends with digit
35        if (building && cur <= prev) return false;
36
37        return true;
38    }
39}
40