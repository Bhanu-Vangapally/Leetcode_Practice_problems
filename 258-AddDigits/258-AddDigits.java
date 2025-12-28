// Last updated: 12/28/2025, 4:53:37 PM
class Solution {
    public int addDigits(int num) {
        if(num==0)
            return 0;
        int r=0,rem=0,s=0,t=num;
        while(t>0)
        {
            rem=t%10;
            s+=rem;
            t/=10;
        }
        if(s>=10)
            return addDigits(s);
        return s;
    }
}