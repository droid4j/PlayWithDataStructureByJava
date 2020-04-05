
public class Solution2 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next; // 跳过 prev 的下一个节点
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }
}
