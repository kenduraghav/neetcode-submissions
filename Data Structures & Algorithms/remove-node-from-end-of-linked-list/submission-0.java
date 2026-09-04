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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null ||  n  < 1){
            return head;
        }

        //create a dummy node and point to head. 
        ListNode dummy = new ListNode(-1,head);
        ListNode slow = dummy;
        ListNode fast = dummy;

        //move fast "n" steps forward
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        //iterate and move each pointer one by one.
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        //skip the node we want to remove
        slow.next = slow.next.next;

        return dummy.next; //return new head

    }
}
