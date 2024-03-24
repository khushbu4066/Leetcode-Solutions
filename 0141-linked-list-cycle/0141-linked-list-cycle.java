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
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         Set<ListNode>s = new HashSet<>();
//         while(head != null){
//             if(s.contains(head)){
//                 return true;
//             }
//         s.add(head);
//         head = head.next;
//         }
//         return false;
//     }
// }
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}



// Intuition
// Floyd's Tortoise and Hare algorithm.

// Approach
// Initializing two pointers "slow" increments by one node and "fast" increments by two nodes to the head.
// (fast != null && fast.next != null) this condition is checked so that we can check if we put fast pointer two place ahead or not.
// One the first loop distance btw slow and fast is 0 and it increases by one in each loop so thier will be one point when fast and slow will be at same position if a cycle exist.
// if the linked list does not have a cycle while loop conditions stops the loop and return false.
// Complexity
// Time complexity: O(n), where n is the number of nodes in the linked list.
// Space complexity:O(1)