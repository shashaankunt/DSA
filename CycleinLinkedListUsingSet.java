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
        HashSet<ListNode> hs=new HashSet<>();
        
        while(head!=null)
        {
            if(hs.contains(head.next)) return true;
            else hs.add(head.next);
            head=head.next;
        }
        return false;
    }
}
