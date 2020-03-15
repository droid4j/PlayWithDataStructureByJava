
public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) { // 删除开始部分的结点
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head == null)
            return null;

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
}
