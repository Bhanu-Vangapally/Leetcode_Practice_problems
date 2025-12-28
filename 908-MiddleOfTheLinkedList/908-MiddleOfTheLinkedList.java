// Last updated: 12/28/2025, 4:52:48 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode t=head;
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        c=c/2;
        t=head;
        while(t!=null && c!=0){
            c--;
            t=t.next;
        }
        return t;
    }
}