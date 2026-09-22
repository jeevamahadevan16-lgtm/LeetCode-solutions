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
    public boolean hasCycle(ListNode head) {
        ListNode fast;
        ListNode slow;
        if(head==null) return false;
        fast=head;
        slow=head;
        while(true){
            fast=fast.next;
            if(fast==null)  break;
            if(slow==fast) return true;
            slow=slow.next;
            fast=fast.next;
             if(fast==null)  break;
            if(slow==fast) return true;
            
            
           
            }
        return false;
    }
    
}