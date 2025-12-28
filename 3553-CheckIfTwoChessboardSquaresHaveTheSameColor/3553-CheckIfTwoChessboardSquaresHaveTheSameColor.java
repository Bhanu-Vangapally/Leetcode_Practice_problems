// Last updated: 12/28/2025, 4:51:24 PM
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int [][] m=new int[8][8];
        int n=8;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) m[i][j]=0;
                else if(i%2==0){
                    if(j%2!=0) m[i][j]=1;
                    else m[i][j]=0;
                }
                else{
                    if(j%2==0) m[i][j]=1;
                    else m[i][j]=0;
                }
            }
        }
        // }
        // int a[]={1,0,1,0,1,0,1,0};
        // int b[]={0,1,0,1,0,1,0,1};
        // int c[]=new int[8];
        // int d[]=new int[8];
        // int e[]=new int[8];
        // int f[]=new int[8];
        // int g[]=new int[8];
        // int h[]=new int[8];
        // for(int i:a){
        //     int k=0;
        //     c[k]=e[k]=g[k]=i;
        //     k++;
        // }
        // for(int i:b){
        //     int k=0;
        //     d[k]=f[k]=h[k]=i;
        //     k++;
        // }
        //  for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(m[i][j]);
        //     }
        //     System.out.println();
        // }
        int row1 = coordinate1.charAt(1) - '1'; 
        int col1 = coordinate1.charAt(0) - 'a'; 
        int row2 = coordinate2.charAt(1) - '1'; 
        int col2 = coordinate2.charAt(0) - 'a'; 
        return m[row1][col1] == m[row2][col2];
    }
}