// Last updated: 12/28/2025, 4:51:33 PM
class Solution {
    public String losingPlayer(int x, int y) {
        if(x==0 || y<4)
            return "Bob";
        int mx=Math.min(x,y/4);
        if(mx%2==0) return "Bob";
        return "Alice"; 
        
    }
}