// Last updated: 12/28/2025, 4:53:20 PM
class Solution {
    public void reverseString(char[] s) {
        int i;
        char t;
        for(i=0;i<s.length/2;i++){
            t=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=t;
        }
    }
}