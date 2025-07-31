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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        int N = 0;
        ListNode curr = head;

        // Count total nodes in the list
        while (curr != null) {
            N++;
            curr = curr.next;
        }

        int splitSize = N / k; // Base size of each part
        int rem = N % k;       // Number of parts that should have an extra node

        curr = head;
        for (int i = 0; i < k; i++) {
            ListNode headPart = curr;
            int currentPartSize = splitSize + (rem > 0 ? 1 : 0);
            if (rem > 0) rem--;

            // Traverse to the last node of the current part
            for (int j = 0; j < currentPartSize - 1 && curr != null; j++) {
                curr = curr.next;
            }
            // Break the list if current node is not null
            if (curr != null) {
                ListNode nextPartHead = curr.next;
                curr.next = null; // End of current part
                curr = nextPartHead; // Move to the start of next part
            }

            res[i] = headPart;
        }

        return res;
    }
}