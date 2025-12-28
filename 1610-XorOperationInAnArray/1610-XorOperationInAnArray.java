// Last updated: 12/28/2025, 4:52:41 PM
class Solution {
    public int xorOperation(int n, int start) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int k=start+2*i;
            a.add(k);
        }
        int d=0;
        for(int ele: a)
        {
            d^=ele;
        }
        return d;
        
    }
}