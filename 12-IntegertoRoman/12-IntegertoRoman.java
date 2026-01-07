// Last updated: 1/7/2026, 10:50:13 PM
1class Solution {
2    public String intToRoman(int num) {
3            int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
4    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
5    
6    StringBuilder sb = new StringBuilder();
7    for(int i=0;i<values.length;i++) {
8        while(num >= values[i]) {
9            num -= values[i];
10            sb.append(strs[i]);
11        }
12    }
13    return sb.toString();
14    }
15}