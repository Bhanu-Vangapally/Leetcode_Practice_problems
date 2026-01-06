// Last updated: 1/6/2026, 7:44:24 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>>res=new ArrayList<>();
4        if(numRows<=0)
5            return res;
6        for(int i=0;i<numRows;i++)
7        {
8            List<Integer> r=new ArrayList<>();
9            for(int j=0;j<=i;j++)
10            {
11                if(j==0 || i==j)
12                r.add(1);
13                else
14                r.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
15            }
16            res.add(r);
17            
18        }
19        return res;
20    }
21}