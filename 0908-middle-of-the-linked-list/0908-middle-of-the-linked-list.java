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
        int size=0;
        boolean flag=true;//when size of the list is odd.
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;


        if(flag){
            for(int i=0;i<size/2;i++){
                temp=temp.next;
            }
            return temp;
        }else{
            for(int i=0;i<(size/2)+1;i++){
                temp=temp.next;
            }
            return temp;
        }
    }
}