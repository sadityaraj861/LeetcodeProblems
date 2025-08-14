/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int Size(ListNode head){
        ListNode temp=head;

        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int Size_A=Size(headA);
        int Size_B=Size(headB);

        int diff_length=Math.abs(Size_A-Size_B);//returns positive val

        ListNode big=headA;
        ListNode small=headB;

/*---jo bada list h uska pointer to chote ke barabar la rhe baad me increment krke match krte rahenge ----*/
        if(Size_A>Size_B){
            for(int i=0;i<diff_length;i++){
                big=big.next;
            }
        }else{
            for(int i=0;i<diff_length;i++){
                small=small.next;
            }
        }


        while(big!=small){
            big=big.next;
            small=small.next;
        }
        /*---now our both pointer lies on the same intersection point 5.-------*/
        if(big!=null){
            return big;
        }else return null;
    }
}