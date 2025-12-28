// Last updated: 12/28/2025, 4:51:21 PM
class Solution {
    public int possibleStringCount(String w) {
        int ct=1,k=0;
        char[] c=w.toCharArray();
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]) ct++;
        }
        return ct;
    }
}