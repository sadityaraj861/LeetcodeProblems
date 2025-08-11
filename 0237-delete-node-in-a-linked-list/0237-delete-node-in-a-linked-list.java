/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {//not valid if we are doing same with the node whichhis the last elemet of linkedlist.  whose next is null;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}