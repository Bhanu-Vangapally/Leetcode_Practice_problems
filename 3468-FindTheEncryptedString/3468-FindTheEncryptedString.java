// Last updated: 12/28/2025, 4:51:44 PM
class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        String t="";
        for(int i=0;i<n;i++)
        {
            int x=(i+k)%n;
            t+=s.charAt(x);
            // System.out.println(s.replace(s.charAt(i),s.charAt(k)));
        }
        return t;
        
    }
}