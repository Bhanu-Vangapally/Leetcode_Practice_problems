// Last updated: 12/31/2025, 1:57:50 PM
1class Solution {
2    
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        int m=obstacleGrid.length;
5        int n=obstacleGrid[0].length;
6        int dp[][]=new int[m][n];
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(obstacleGrid[i][j]==1) dp[i][j]=0;
10                else if(i==0 && j==0) dp[i][j]=1;
11                else{
12                    int up=0,down=0;
13                    if(i>0) up=dp[i-1][j];
14                    if(j>0) down=dp[i][j-1];
15                    dp[i][j]=up+down;
16                }
17            }
18        }
19      return (dp[m-1][n-1]);
20    }
21}