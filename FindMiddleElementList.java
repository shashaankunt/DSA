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
 //Finding middle element of linked list - O(n)
 
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode first=head;
        ListNode sec=head;
        
        while(sec!=null && sec.next!=null)
        {
            first=first.next;
            sec=sec.next.next;
        }
        return first;
        
    }
}
