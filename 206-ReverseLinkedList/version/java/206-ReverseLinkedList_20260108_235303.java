// Last updated: 1/8/2026, 11:53:03 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * Definition for singly-linked list.
13 * public class ListNode {
14 *     int val;
15 *     ListNode next;
16 *     ListNode() {}
17 *     ListNode(int val) { this.val = val; }
18 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
19 * }
20 */
21
22class Solution {
23    public ListNode reverseList(ListNode head) {
24        ListNode prev=null,cur=head;
25        while(cur!=null){
26            ListNode nxt=cur.next;
27            cur.next=prev;
28            prev=cur;
29            cur=nxt;
30        }
31        return prev;
32    }
33}
34