/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        if(head==null) return null;
        while(fast!=null){
            if(fast.next==null) return null;
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast==slow) break;
        }

        ListNode temp=head;

        while(temp!=slow){
            temp=temp.next;
            if(slow.next==null)return null;
            slow=slow.next;
        }
        return slow;
    }
}