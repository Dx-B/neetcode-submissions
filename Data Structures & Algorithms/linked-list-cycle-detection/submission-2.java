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
    public boolean hasCycle(ListNode head) {
        ListNode r1 = head;
        ListNode r2 = head;
        int count = 0;
        while (r1 != null) {
            r1 = r1.next;
            count++;
            if (r1 == null) {
                break;
            }
            if (count%2==0) {
                r2=r2.next;
                if (r1.val==r2.val) {
                    return true;
                }
            }
        }
        return false;
    }
}
