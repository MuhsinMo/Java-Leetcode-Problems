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
    public boolean hasCycle(ListNode head) 
    {
        ListNode i = head;
        ListNode j = head;
        
        while(i != null && i.next != null)
        {
            i = i.next.next;
            j = j.next;
            
            if(i==j)
            {
              return true;  
            }
        }
        
        return false;
        
    }
}
