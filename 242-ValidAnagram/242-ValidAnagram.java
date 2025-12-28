// Last updated: 12/28/2025, 4:53:39 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char [] sarray=s.toCharArray();
        char [] tarray=t.toCharArray();
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        int c=0;
        for(int i=0;i<sarray.length;i++){
            if(sarray[i]!=tarray[i]) return false;
            else c++;
        }
        return true;
    }
}