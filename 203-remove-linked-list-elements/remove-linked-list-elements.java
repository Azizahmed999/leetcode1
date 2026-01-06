class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Dummy node banaya jo head se pehle hoga
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                // Node remove karo
                current.next = current.next.next;
            } else {
                // Aage move karo
                current = current.next;
            }
        }

      
        return dummy.next;
    }
}
