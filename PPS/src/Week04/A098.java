package Week04;
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

class ListNode {
	
	// Definition for singly-linked list.
	int val;
    ListNode next;
    ListNode(int x) {
    	val = x;
        next = null;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while(headA != null) {

            ListNode current = headB;

            while(current != null) {

                if(current == headA)
                    return headA;
        
                else
                    current = current.next;
            }
            
            headA = headA.next;
        }
        
        return null;   
    }
}