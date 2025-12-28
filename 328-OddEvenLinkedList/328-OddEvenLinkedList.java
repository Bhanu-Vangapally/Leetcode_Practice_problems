// Last updated: 12/28/2025, 4:53:23 PM
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        if(head.next==null || head.next.next==null) return head;
        ListNode e=head.next;
        ListNode o=head;
        ListNode t=e;
        while(e!=null && e.next!=null){
            o.next=e.next;
            o=o.next;
            e.next=o.next;
            e=e.next;
        }
         o.next=t;
        return head;
    }
}