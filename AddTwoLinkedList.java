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
 //LEET CODE
 //You are given two non-empty linked lists representing two non-negative integers. 
 //The digits are stored in reverse order, and each of their nodes contains a single digit. 
 //Add the two numbers and return the sum as a linked list.


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        int carry=0;
        //int sum=0;
        // 9 9 9 9
        // 9 9 9
        
        
        while(l1!=null || l2!=null)
        {
            
            int a = (l1==null)?0:l1.val;
            int b = (l2==null)?0:l2.val;
            int sum=a+b+carry;
            carry=(sum>=10)?1:0;
            
            res.next=new ListNode(sum%10);
            res=res.next;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            
            
            
        }
        
        if(carry==1) res.next=new ListNode(carry);
        
        return dummy.next;
        
        
        
        
        
        
    }
}
