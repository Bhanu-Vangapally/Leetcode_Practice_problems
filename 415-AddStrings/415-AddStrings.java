// Last updated: 12/28/2025, 4:53:06 PM
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res=new StringBuilder();
        int c=0;
        int l=num1.length()-1;
        int l1=num2.length()-1;
        while(l>=0 || l1>=0 || c!=0)
        {
            int x=l>=0 ? num1.charAt(l)-'0' : 0;
            int y=l1>=0 ? num2.charAt(l1)-'0' : 0;
            int v=(x+y+c)%10;
            c=(x+y+c)/10;
            res.append(v);
            l--;
            l1--;
        }
        return res.reverse().toString();
    }
}