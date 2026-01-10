// Last updated: 1/10/2026, 11:59:29 PM
1class Solution {
2    public int fib(int n) {
3        if(n==0) return n;
4        if(n==1 || n==2) return 1;
5        int f1=1,f2=1,k=3;
6        while(k<=n){
7            int f3=f1+f2;
8            f1=f2;
9            f2=f3;
10            k++;
11        }
12        return f2;
13    }
14}