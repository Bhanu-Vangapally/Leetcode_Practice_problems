// Last updated: 1/10/2026, 11:58:23 PM
1class Solution {
2    public int fib(int n) {
3        // fib(n);
4        if(n==0) return 0;
5        if(n==1 || n==2) return 1;
6        int k=3;
7        int f1=1,f2=1;
8        while(k<=n){
9            int t=f1+f2;
10            f1=f2;
11            f2=t;
12            k++;
13        }
14        return f2;
15    }
16}