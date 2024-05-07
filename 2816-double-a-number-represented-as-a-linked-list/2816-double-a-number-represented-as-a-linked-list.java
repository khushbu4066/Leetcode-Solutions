class Solution {

    int carry = 0;
    private void recLinkedList(ListNode head){
        if(head == null){
            return;
        }
        recLinkedList(head.next);
        int temp = head.val * 2; 
        temp = temp + carry;
        carry = temp / 10; 
        head.val = temp % 10;
        
    }
    public ListNode doubleIt(ListNode head) {
        recLinkedList(head);
        if(carry == 1){
            ListNode temp = new ListNode(1);
            temp.next = head;
            head = temp;
        }
        return head;
    }
}