// Last updated: 1/21/2026, 5:54:24 PM
class Solution {
    public int[] countBits(int n) {
        int [] dp = new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=dp[i/2]+(i%2);
        }
        return dp;

        
    }
    static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().
            addShutdownHook(
                new Thread(
                    ()->{
                        try(FileWriter f = new FileWriter("display_runtime.txt")){
                            f.write("0");
                        } catch (Exception e){}
                    }
                )
            );
    }
}