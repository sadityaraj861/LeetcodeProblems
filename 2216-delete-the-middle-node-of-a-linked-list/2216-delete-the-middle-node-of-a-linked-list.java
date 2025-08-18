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
    public ListNode deleteMiddle(ListNode head) {

         if(head.next==null){ //very very important.
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;

//fast.next.next for handling even no of list   // fast.next.next.next for handling odd no of list.
        while(fast.next.next!=null && fast.next.next.next!=null){ // written fast.next.next before to handell runtime error.
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;//for deletion of node

        return head;
    }
}